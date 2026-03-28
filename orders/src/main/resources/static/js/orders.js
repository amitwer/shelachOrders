window.productsByName = new Map();
window.productsByBarcode = new Map();
window.productsByCategory = new Map();
window.finalOrders = new Set();
let overallCostInOrder = 0;
let overallCostInSummary = 0;

function addRowToOrderTable(barcode, name, price) {
    //create row
    let rowNum = window.orderTable.rows.length;
    let row = window.orderTable.insertRow(rowNum);
    let rowNumCell = row.insertCell(0);
    let barcodeCell = row.insertCell(1);
    let nameCell = row.insertCell(2);
    let priceCell = row.insertCell(3);
    let amountCell = row.insertCell(4);
    row.insertCell(5);
    //fill row
    rowNumCell.innerHTML = rowNum;
    barcodeCell.innerHTML = barcode;
    nameCell.innerHTML = name;
    priceCell.innerHTML = price;
    let enterAmountElement = document.createElement("input");
    enterAmountElement.addEventListener("focus", function changeAmount() {
        let row = window.orderTable.rows[rowNum];
        if (this.value !== "") {
            let cost = parseFloat(this.value) * parseFloat(row.cells[3].innerHTML);
            overallCostInOrder -= cost;
        }
    });
    //add onchange function to compute overall cost
    enterAmountElement.addEventListener("change", function setOverallPrice() {
        let row = window.orderTable.rows[rowNum];
        if (this.value !== "") {
            let cost = parseFloat(this.value) * parseFloat(row.cells[3].innerHTML);
            row.cells[5].innerHTML = (cost).toFixed(2);
            overallCostInOrder += cost;
        } else {
            row.cells[5].innerHTML = "";
        }
        overallCostInOrderBox.value = overallCostInOrder.toFixed(2);
        console.log(overallCostInOrder);
    });
    amountCell.appendChild(enterAmountElement);
}


function initPage() {
    window.overallCostInOrderBox = document.getElementById("overallOrderCost");
    window.overallCostInSummaryBox = document.getElementById("overallOrderSummeryCost");
    window.orderTable = document.getElementById("orderTable");
    window.orderSummaryTable = document.getElementById("orderSummaryTable").getElementsByTagName("tbody")[0];
    window.categories = new Set();
    window.selectDepartmentDropdown = document.getElementById("selectDepartment");
    let i;
    for (i = 0; i < window.products.length; i++) {
        window.categories = window.categories.add(window.products[i].category)
    }
    for (let val of window.categories) {
        window.productsByCategory.set(val, new Set());
        let option = document.createElement('option');
        option.text = val;
        window.selectDepartmentDropdown.appendChild(option);
    }
    for (let product of window.products) {
        window.productsByCategory.get(product.category).add(product);
        window.productsByName.set(product.name, product);
        window.productsByBarcode.set(product.barcode, product);
    }
}


function departmentSelected() {
    while (window.orderTable.rows.length > 1) {
        window.orderTable.deleteRow(window.orderTable.rows.length - 1);
    }
    for (let [category, productSet] of window.productsByCategory) {
        if (window.selectDepartmentDropdown.value === category) {
            for (let product of productSet) {
                addRowToOrderTable(product.barcode, product.name, product.price);
            }
        }
    }
}


function addProduct() {
    let i;
    for (i = 1; i < window.orderTable.rows.length; i++) {
        let row = window.orderTable.rows[i];
        let enterAmount = row.cells[4].getElementsByTagName("input")[0];
        if (enterAmount != null && enterAmount.value !== "") {
            let newRow = window.orderSummaryTable.insertRow();
            newRow.insertCell(0);
            newRow.insertCell(1);
            newRow.insertCell(2);
            newRow.insertCell(3);
            newRow.insertCell(4);
            newRow.insertCell(5);
            newRow.cells[0].innerText = window.selectDepartmentDropdown.value;
            newRow.cells[1].innerText = row.cells[1].innerText;
            newRow.cells[2].innerText = row.cells[1].innerText;
            newRow.cells[3].innerText = row.cells[3].innerText;
            newRow.cells[4].innerText = enterAmount.value;
            newRow.cells[5].innerText = row.cells[5].innerText;
            let cell = newRow.insertCell(-1);
            cell.innerHTML = "<td ><input type=\"checkbox\" />&nbsp;</td>";
            window.finalOrders.add(window.productsByBarcode.get(row.cells[1].innerText));
        }
    }
    for (i = window.orderTable.rows.length - 1; i > 0; i--) {
        window.orderTable.deleteRow(i);
    }
    window.selectDepartmentDropdown.value = window.selectDepartmentDropdown.options[0].text;
    overallCostInSummary += overallCostInOrder;
    overallCostInSummaryBox.value = overallCostInSummary;
    overallCostInOrder = 0;
    overallCostInOrderBox.value = ""
}

function sendOrder() {
    for (let order of window.finalOrders) {
        console.log(order);
    }
}

function deleteSelectedOrders() {
    let i;
    let rowCount = window.orderSummaryTable.rows.length;
    for (i = rowCount - 1; i >= 0; i--) {
        let row = window.orderSummaryTable.rows[i];
        let chkbox = row.cells[6].getElementsByTagName("input")[0];
        if (chkbox != null && chkbox.type === 'checkbox' && chkbox.checked === true) {
            overallCostInSummary -= parseFloat(row.cells[5].innerHTML);
            window.orderSummaryTable.deleteRow(i);
        }
    }
    overallCostInSummaryBox.value = overallCostInSummary;
}