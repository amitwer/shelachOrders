window.productsByName = new Map();
window.productsByBarcode = new Map();
window.productsByCategory = new Map();
window.finalOrders = new Set();

function removeOptions(selectbox) {
    var i;
    for (i = selectbox.options.length - 1; i >= 0; i--) {
        selectbox.remove(i);
    }
}

function initPage() {
    window.barcode_input = document.getElementById("enterBarcode");
    window.barcode_input.disabled = true;
    window.orderForm = document.getElementById("orderTable");
    window.orderSummaryTable = document.getElementById("orderSummaryTable").getElementsByTagName("tbody")[0];
    window.categories = new Set();
    window.selectDepartmentDropdown = document.getElementById("selectDepartment");
    window.chooseProductName = document.getElementById("chooseProductName");
    window.enterAmount = document.getElementById("enterAmount");
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

function updateOrderFormInfoFromProduct(product) {
    let row = window.orderForm.rows[window.orderForm.rows.length - 1];
    this.selectDepartmentDropdown.value = product.category;
    let option = document.createElement('option');
    option.text = product.name;
    window.chooseProductName.appendChild(option);
    row.cells[3].innerText = product.price;
    window.barcode_input.value = product.barcode;
    row.cells[5].innerText = "0";
}

function clearProductFromOrderFormExceptCategory() {
    let row = window.orderForm.rows[window.orderForm.rows.length - 1];
    row.cells[3].innerText = "";
    window.barcode_input.value = "";
    row.cells[5].innerText = "";
    window.chooseProductName.value = "";
}

function getProductFromName() {
    if (window.productsByName.has(window.chooseProductName.value)) {
        let product = window.productsByName.get(window.chooseProductName.value);
        updateOrderFormInfoFromProduct(product);
    } else {
        clearProductFromOrderFormExceptCategory();
    }
}

function getProductFromBarcode() {
    if (window.productsByBarcode.has(window.barcode_input.value)) {
        let product = window.productsByBarcode.get(window.barcode_input.value);
        updateOrderFormInfoFromProduct(product);
    } else {
        clearProductFromOrderFormExceptCategory();
        window.chooseProductName.selectedIndex = 0;
    }
}

function amountChosen() {
    let row = window.orderForm.rows[window.orderForm.rows.length - 1];
    row.cells[5].innerText = (parseFloat(row.cells[3].innerText) * document.getElementById("enterAmount").value);
}

function departmentSelected() {
    let i;
    for (i = window.chooseProductName.length - 1; i >= 0; i--) {
        window.chooseProductName.removeChild(window.chooseProductName.lastChild)
    }
    clearProductFromOrderFormExceptCategory();
    let option = document.createElement('option');
    option.text = "בחר מוצר...";
    window.chooseProductName.appendChild(option);
    for (let [category, productSet] of window.productsByCategory) {
        if (window.selectDepartmentDropdown.value === category) {
            for (let product of productSet) {
                let option = document.createElement('option');
                option.text = product.name;
                window.chooseProductName.appendChild(option);
            }
        }
    }
}

function clearProductFromOrderForm() {
    let row = window.orderForm.rows[window.orderForm.rows.length - 1];
    window.selectDepartmentDropdown.value = window.selectDepartmentDropdown.options[0].text;
    window.barcode_input.value = "";
    removeOptions(window.chooseProductName);
    window.enterAmount.value = "";
    row.cells[3].innerText = "";
    row.cells[5].innerText = "";
}

function addProduct() {
    if (window.selectDepartmentDropdown.value !== window.selectDepartmentDropdown.options[0].text
        && window.barcode_input.value !== "" && window.enterAmount.value !== "" && window.enterAmount.value > 0) {
        let row = window.orderForm.rows[window.orderForm.rows.length - 1].cloneNode(true);
        let newRow = window.orderSummaryTable.insertRow();
        newRow.insertCell(0);
        newRow.insertCell(1);
        newRow.insertCell(2);
        newRow.insertCell(3);
        newRow.insertCell(4);
        newRow.insertCell(5);
        newRow.cells[0].innerText = window.selectDepartmentDropdown.value;
        newRow.cells[1].innerText = window.barcode_input.value;
        newRow.cells[2].innerText = window.chooseProductName.value;
        newRow.cells[3].innerText = row.cells[3].innerText;
        newRow.cells[4].innerText = window.enterAmount.value;
        newRow.cells[5].innerText = row.cells[5].innerText;
        let cell = newRow.insertCell(-1);
        cell.innerHTML = "<td ><input type=\"checkbox\" />&nbsp;</td>";
        window.finalOrders.add(window.productsByBarcode.get(window.barcode_input.value));
        clearProductFromOrderForm();
    }
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
            window.orderSummaryTable.deleteRow(i);
        }
    }
}