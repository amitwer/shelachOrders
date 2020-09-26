
package com.shelach.orders.comax.generated.itemdetails;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClsItemsType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ClsItemsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Size" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="OldID" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="Barcode" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="PurchasingAccountID" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="SalesAccountID" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="AlternateID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="WorkByAlternateID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SerialNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="DiscountPercent" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="DiscountTotal" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="TotalSum" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="MaxQuantityInOrder" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="CorrectionPrice" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="CorrectionDiscountPercent" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="CorrectionQuantity" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="ConversionQuantity" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="SuperDepartment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SuperDepartmentCode" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="Department" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DepartmentCode" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="DepartmentEnglishName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Group" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="GroupCode" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="GroupEnglishName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Sub_Group" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Sub_GroupCode" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="Sub_GroupEnglishName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Manufacturer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ManufacturerCode" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="ItemModel" type="{http://ws.comax.co.il/Comax_WebServices/}ItemModelType"/>
 *         &lt;element name="ItemColor" type="{http://ws.comax.co.il/Comax_WebServices/}ItemColorType"/>
 *         &lt;element name="ItemSize" type="{http://ws.comax.co.il/Comax_WebServices/}ItemSizeType"/>
 *         &lt;element name="Attribute1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Attribute1Code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Attribute2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Attribute2Code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Attribute3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Attribute3Code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Attribute4" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Attribute4Code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Attribute5" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Attribute5Code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SupplierID" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="SupplierName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SupplierCatalogNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SupplierPrice" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="ArchiveDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BlockPurchaseDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BlockSalesDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EnglishName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PromoID" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="PromoRank" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="MatchingItemID" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="MatchingItemQuantity" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="UnitsQuantity" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="Length" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="LengthSize" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Width" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="WidthSize" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Height" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="HeightSize" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Weight" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="WeightSize" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PicURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrentStoreID" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="BaseLine" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="BaseDocNumber" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="BaseReference" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="BaseYear" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="Conversion" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="AdditionalConversion" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="NotShowInWeb" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SetModelProperties" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HierarchyUpdate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DownloadPriceTransparencyAfter48Hours" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ItemData" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RejectTypeID" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="OpenDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="WarrantyMonths" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="Ingredients" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FullIngredientsReplace" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CmtAmara" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="AmaraBy" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CmtAmara2" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="InternalAmara" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="Line" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="LengthOptic" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="DiagonalOptic" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="HeightOptic" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="NameInWeb" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NosafKod_2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NosafNm_2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NosafKod_3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NosafNm_3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AtarDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Energia" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="Pahmemot" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="Helbonim" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="Shumanim" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="Colestrol" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="MhrMivza" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="SwBonos" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BonosFline" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="BonosTline" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="Mirsham_PhrmaSoft" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="CustomerMakat" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="QtyType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NoDiscount" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="PriceUSD" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="PriceNIS" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="WarrantySupplier" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="WarrantyRemark" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClsItemsType", namespace = "http://ws.comax.co.il/Comax_WebServices/", propOrder = {
        "name",
        "size",
        "id",
        "oldID",
        "barcode",
        "purchasingAccountID",
        "salesAccountID",
        "alternateID",
        "workByAlternateID",
        "serialNo",
        "price",
        "quantity",
        "discountPercent",
        "discountTotal",
        "totalSum",
        "maxQuantityInOrder",
        "correctionPrice",
        "correctionDiscountPercent",
        "correctionQuantity",
        "conversionQuantity",
        "superDepartment",
        "superDepartmentCode",
        "department",
        "departmentCode",
        "departmentEnglishName",
        "group",
        "groupCode",
        "groupEnglishName",
        "subGroup",
        "subGroupCode",
        "subGroupEnglishName",
        "manufacturer",
        "manufacturerCode",
        "itemModel",
        "itemColor",
        "itemSize",
        "attribute1",
        "attribute1Code",
        "attribute2",
        "attribute2Code",
        "attribute3",
        "attribute3Code",
        "attribute4",
        "attribute4Code",
        "attribute5",
        "attribute5Code",
        "supplierID",
        "supplierName",
        "supplierCatalogNumber",
        "supplierPrice",
        "archiveDate",
        "blockPurchaseDate",
        "blockSalesDate",
        "englishName",
        "promoID",
        "promoRank",
        "matchingItemID",
        "matchingItemQuantity",
        "unitsQuantity",
        "length",
        "lengthSize",
        "width",
        "widthSize",
        "height",
        "heightSize",
        "weight",
        "weightSize",
        "picURL",
        "currentStoreID",
        "baseLine",
        "baseDocNumber",
        "baseReference",
        "baseYear",
        "conversion",
        "additionalConversion",
        "notShowInWeb",
        "setModelProperties",
        "hierarchyUpdate",
        "downloadPriceTransparencyAfter48Hours",
        "itemData",
        "rejectTypeID",
        "openDate",
        "warrantyMonths",
        "ingredients",
        "fullIngredientsReplace",
        "cmtAmara",
        "amaraBy",
        "cmtAmara2",
        "internalAmara",
        "line",
        "lengthOptic",
        "diagonalOptic",
        "heightOptic",
        "nameInWeb",
        "nosafKod2",
        "nosafNm2",
        "nosafKod3",
        "nosafNm3",
        "atarDescription",
        "energia",
        "pahmemot",
        "helbonim",
        "shumanim",
        "colestrol",
        "mhrMivza",
        "swBonos",
        "bonosFline",
        "bonosTline",
        "mirshamPhrmaSoft",
        "customerMakat",
        "qtyType",
        "noDiscount",
        "priceUSD",
        "priceNIS",
        "warrantySupplier",
        "warrantyRemark"
})
public class ItemDetails {

    @XmlElement(name = "Name", namespace = "http://ws.comax.co.il/Comax_WebServices/", required = true)
    protected String name;
    @XmlElement(name = "Size", namespace = "http://ws.comax.co.il/Comax_WebServices/", required = true)
    protected String size;
    @XmlElement(name = "ID", namespace = "http://ws.comax.co.il/Comax_WebServices/")
    protected byte id;
    @XmlElement(name = "OldID", namespace = "http://ws.comax.co.il/Comax_WebServices/")
    protected byte oldID;
    @XmlElement(name = "Barcode", namespace = "http://ws.comax.co.il/Comax_WebServices/")
    protected String barcode;
    @XmlElement(name = "PurchasingAccountID", namespace = "http://ws.comax.co.il/Comax_WebServices/")
    protected byte purchasingAccountID;
    @XmlElement(name = "SalesAccountID", namespace = "http://ws.comax.co.il/Comax_WebServices/")
    protected byte salesAccountID;
    @XmlElement(name = "AlternateID", namespace = "http://ws.comax.co.il/Comax_WebServices/", required = true)
    protected String alternateID;
    @XmlElement(name = "WorkByAlternateID", namespace = "http://ws.comax.co.il/Comax_WebServices/", required = true)
    protected String workByAlternateID;
    @XmlElement(name = "SerialNo", namespace = "http://ws.comax.co.il/Comax_WebServices/", required = true)
    protected String serialNo;
    @XmlElement(name = "Price", namespace = "http://ws.comax.co.il/Comax_WebServices/")
    protected byte price;
    @XmlElement(name = "Quantity", namespace = "http://ws.comax.co.il/Comax_WebServices/")
    protected byte quantity;
    @XmlElement(name = "DiscountPercent", namespace = "http://ws.comax.co.il/Comax_WebServices/")
    protected byte discountPercent;
    @XmlElement(name = "DiscountTotal", namespace = "http://ws.comax.co.il/Comax_WebServices/")
    protected byte discountTotal;
    @XmlElement(name = "TotalSum", namespace = "http://ws.comax.co.il/Comax_WebServices/")
    protected byte totalSum;
    @XmlElement(name = "MaxQuantityInOrder", namespace = "http://ws.comax.co.il/Comax_WebServices/")
    protected byte maxQuantityInOrder;
    @XmlElement(name = "CorrectionPrice", namespace = "http://ws.comax.co.il/Comax_WebServices/")
    protected byte correctionPrice;
    @XmlElement(name = "CorrectionDiscountPercent", namespace = "http://ws.comax.co.il/Comax_WebServices/")
    protected byte correctionDiscountPercent;
    @XmlElement(name = "CorrectionQuantity", namespace = "http://ws.comax.co.il/Comax_WebServices/")
    protected byte correctionQuantity;
    @XmlElement(name = "ConversionQuantity", namespace = "http://ws.comax.co.il/Comax_WebServices/")
    protected byte conversionQuantity;
    @XmlElement(name = "SuperDepartment", namespace = "http://ws.comax.co.il/Comax_WebServices/", required = true)
    protected String superDepartment;
    @XmlElement(name = "SuperDepartmentCode", namespace = "http://ws.comax.co.il/Comax_WebServices/")
    protected byte superDepartmentCode;
    @XmlElement(name = "Department", namespace = "http://ws.comax.co.il/Comax_WebServices/", required = true)
    protected String department;
    @XmlElement(name = "DepartmentCode", namespace = "http://ws.comax.co.il/Comax_WebServices/")
    protected byte departmentCode;
    @XmlElement(name = "DepartmentEnglishName", namespace = "http://ws.comax.co.il/Comax_WebServices/", required = true)
    protected String departmentEnglishName;
    @XmlElement(name = "Group", namespace = "http://ws.comax.co.il/Comax_WebServices/", required = true)
    protected String group;
    @XmlElement(name = "GroupCode", namespace = "http://ws.comax.co.il/Comax_WebServices/")
    protected byte groupCode;
    @XmlElement(name = "GroupEnglishName", namespace = "http://ws.comax.co.il/Comax_WebServices/", required = true)
    protected String groupEnglishName;
    @XmlElement(name = "Sub_Group", namespace = "http://ws.comax.co.il/Comax_WebServices/", required = true)
    protected String subGroup;
    @XmlElement(name = "Sub_GroupCode", namespace = "http://ws.comax.co.il/Comax_WebServices/")
    protected byte subGroupCode;
    @XmlElement(name = "Sub_GroupEnglishName", namespace = "http://ws.comax.co.il/Comax_WebServices/", required = true)
    protected String subGroupEnglishName;
    @XmlElement(name = "Manufacturer", namespace = "http://ws.comax.co.il/Comax_WebServices/", required = true)
    protected String manufacturer;
    @XmlElement(name = "ManufacturerCode", namespace = "http://ws.comax.co.il/Comax_WebServices/")
    protected byte manufacturerCode;
    @XmlElement(name = "ItemModel", namespace = "http://ws.comax.co.il/Comax_WebServices/", required = true)
    protected ItemModelType itemModel;
    @XmlElement(name = "ItemColor", namespace = "http://ws.comax.co.il/Comax_WebServices/", required = true)
    protected ItemColorType itemColor;
    @XmlElement(name = "ItemSize", namespace = "http://ws.comax.co.il/Comax_WebServices/", required = true)
    protected ItemSizeType itemSize;
    @XmlElement(name = "Attribute1", namespace = "http://ws.comax.co.il/Comax_WebServices/", required = true)
    protected String attribute1;
    @XmlElement(name = "Attribute1Code", namespace = "http://ws.comax.co.il/Comax_WebServices/", required = true)
    protected String attribute1Code;
    @XmlElement(name = "Attribute2", namespace = "http://ws.comax.co.il/Comax_WebServices/", required = true)
    protected String attribute2;
    @XmlElement(name = "Attribute2Code", namespace = "http://ws.comax.co.il/Comax_WebServices/", required = true)
    protected String attribute2Code;
    @XmlElement(name = "Attribute3", namespace = "http://ws.comax.co.il/Comax_WebServices/", required = true)
    protected String attribute3;
    @XmlElement(name = "Attribute3Code", namespace = "http://ws.comax.co.il/Comax_WebServices/", required = true)
    protected String attribute3Code;
    @XmlElement(name = "Attribute4", namespace = "http://ws.comax.co.il/Comax_WebServices/", required = true)
    protected String attribute4;
    @XmlElement(name = "Attribute4Code", namespace = "http://ws.comax.co.il/Comax_WebServices/", required = true)
    protected String attribute4Code;
    @XmlElement(name = "Attribute5", namespace = "http://ws.comax.co.il/Comax_WebServices/", required = true)
    protected String attribute5;
    @XmlElement(name = "Attribute5Code", namespace = "http://ws.comax.co.il/Comax_WebServices/", required = true)
    protected String attribute5Code;
    @XmlElement(name = "SupplierID", namespace = "http://ws.comax.co.il/Comax_WebServices/")
    protected short supplierID;
    @XmlElement(name = "SupplierName", namespace = "http://ws.comax.co.il/Comax_WebServices/", required = true)
    protected String supplierName;
    @XmlElement(name = "SupplierCatalogNumber", namespace = "http://ws.comax.co.il/Comax_WebServices/", required = true)
    protected String supplierCatalogNumber;
    @XmlElement(name = "SupplierPrice", namespace = "http://ws.comax.co.il/Comax_WebServices/")
    protected float supplierPrice;
    @XmlElement(name = "ArchiveDate", namespace = "http://ws.comax.co.il/Comax_WebServices/", required = true)
    protected String archiveDate;
    @XmlElement(name = "BlockPurchaseDate", namespace = "http://ws.comax.co.il/Comax_WebServices/", required = true)
    protected String blockPurchaseDate;
    @XmlElement(name = "BlockSalesDate", namespace = "http://ws.comax.co.il/Comax_WebServices/", required = true)
    protected String blockSalesDate;
    @XmlElement(name = "EnglishName", namespace = "http://ws.comax.co.il/Comax_WebServices/", required = true)
    protected String englishName;
    @XmlElement(name = "PromoID", namespace = "http://ws.comax.co.il/Comax_WebServices/")
    protected byte promoID;
    @XmlElement(name = "PromoRank", namespace = "http://ws.comax.co.il/Comax_WebServices/")
    protected byte promoRank;
    @XmlElement(name = "MatchingItemID", namespace = "http://ws.comax.co.il/Comax_WebServices/")
    protected byte matchingItemID;
    @XmlElement(name = "MatchingItemQuantity", namespace = "http://ws.comax.co.il/Comax_WebServices/")
    protected byte matchingItemQuantity;
    @XmlElement(name = "UnitsQuantity", namespace = "http://ws.comax.co.il/Comax_WebServices/")
    protected byte unitsQuantity;
    @XmlElement(name = "Length", namespace = "http://ws.comax.co.il/Comax_WebServices/")
    protected byte length;
    @XmlElement(name = "LengthSize", namespace = "http://ws.comax.co.il/Comax_WebServices/", required = true)
    protected String lengthSize;
    @XmlElement(name = "Width", namespace = "http://ws.comax.co.il/Comax_WebServices/")
    protected byte width;
    @XmlElement(name = "WidthSize", namespace = "http://ws.comax.co.il/Comax_WebServices/", required = true)
    protected String widthSize;
    @XmlElement(name = "Height", namespace = "http://ws.comax.co.il/Comax_WebServices/")
    protected byte height;
    @XmlElement(name = "HeightSize", namespace = "http://ws.comax.co.il/Comax_WebServices/", required = true)
    protected String heightSize;
    @XmlElement(name = "Weight", namespace = "http://ws.comax.co.il/Comax_WebServices/")
    protected byte weight;
    @XmlElement(name = "WeightSize", namespace = "http://ws.comax.co.il/Comax_WebServices/", required = true)
    protected String weightSize;
    @XmlElement(name = "PicURL", namespace = "http://ws.comax.co.il/Comax_WebServices/")
    protected String picURL;
    @XmlElement(name = "CurrentStoreID", namespace = "http://ws.comax.co.il/Comax_WebServices/")
    protected byte currentStoreID;
    @XmlElement(name = "BaseLine", namespace = "http://ws.comax.co.il/Comax_WebServices/")
    protected byte baseLine;
    @XmlElement(name = "BaseDocNumber", namespace = "http://ws.comax.co.il/Comax_WebServices/")
    protected byte baseDocNumber;
    @XmlElement(name = "BaseReference", namespace = "http://ws.comax.co.il/Comax_WebServices/")
    protected byte baseReference;
    @XmlElement(name = "BaseYear", namespace = "http://ws.comax.co.il/Comax_WebServices/")
    protected byte baseYear;
    @XmlElement(name = "Conversion", namespace = "http://ws.comax.co.il/Comax_WebServices/")
    protected byte conversion;
    @XmlElement(name = "AdditionalConversion", namespace = "http://ws.comax.co.il/Comax_WebServices/")
    protected byte additionalConversion;
    @XmlElement(name = "NotShowInWeb", namespace = "http://ws.comax.co.il/Comax_WebServices/", required = true)
    protected String notShowInWeb;
    @XmlElement(name = "SetModelProperties", namespace = "http://ws.comax.co.il/Comax_WebServices/", required = true)
    protected String setModelProperties;
    @XmlElement(name = "HierarchyUpdate", namespace = "http://ws.comax.co.il/Comax_WebServices/", required = true)
    protected String hierarchyUpdate;
    @XmlElement(name = "DownloadPriceTransparencyAfter48Hours", namespace = "http://ws.comax.co.il/Comax_WebServices/", required = true)
    protected String downloadPriceTransparencyAfter48Hours;
    @XmlElement(name = "ItemData", namespace = "http://ws.comax.co.il/Comax_WebServices/", required = true)
    protected String itemData;
    @XmlElement(name = "RejectTypeID", namespace = "http://ws.comax.co.il/Comax_WebServices/")
    protected byte rejectTypeID;
    @XmlElement(name = "OpenDate", namespace = "http://ws.comax.co.il/Comax_WebServices/", required = true)
    protected String openDate;
    @XmlElement(name = "WarrantyMonths", namespace = "http://ws.comax.co.il/Comax_WebServices/")
    protected byte warrantyMonths;
    @XmlElement(name = "Ingredients", namespace = "http://ws.comax.co.il/Comax_WebServices/", required = true)
    protected String ingredients;
    @XmlElement(name = "FullIngredientsReplace", namespace = "http://ws.comax.co.il/Comax_WebServices/", required = true)
    protected String fullIngredientsReplace;
    @XmlElement(name = "CmtAmara", namespace = "http://ws.comax.co.il/Comax_WebServices/")
    protected byte cmtAmara;
    @XmlElement(name = "AmaraBy", namespace = "http://ws.comax.co.il/Comax_WebServices/", required = true)
    protected String amaraBy;
    @XmlElement(name = "CmtAmara2", namespace = "http://ws.comax.co.il/Comax_WebServices/")
    protected byte cmtAmara2;
    @XmlElement(name = "InternalAmara", namespace = "http://ws.comax.co.il/Comax_WebServices/")
    protected byte internalAmara;
    @XmlElement(name = "Line", namespace = "http://ws.comax.co.il/Comax_WebServices/")
    protected byte line;
    @XmlElement(name = "LengthOptic", namespace = "http://ws.comax.co.il/Comax_WebServices/")
    protected byte lengthOptic;
    @XmlElement(name = "DiagonalOptic", namespace = "http://ws.comax.co.il/Comax_WebServices/")
    protected byte diagonalOptic;
    @XmlElement(name = "HeightOptic", namespace = "http://ws.comax.co.il/Comax_WebServices/")
    protected byte heightOptic;
    @XmlElement(name = "NameInWeb", namespace = "http://ws.comax.co.il/Comax_WebServices/", required = true)
    protected String nameInWeb;
    @XmlElement(name = "NosafKod_2", namespace = "http://ws.comax.co.il/Comax_WebServices/", required = true)
    protected String nosafKod2;
    @XmlElement(name = "NosafNm_2", namespace = "http://ws.comax.co.il/Comax_WebServices/", required = true)
    protected String nosafNm2;
    @XmlElement(name = "NosafKod_3", namespace = "http://ws.comax.co.il/Comax_WebServices/", required = true)
    protected String nosafKod3;
    @XmlElement(name = "NosafNm_3", namespace = "http://ws.comax.co.il/Comax_WebServices/", required = true)
    protected String nosafNm3;
    @XmlElement(name = "AtarDescription", namespace = "http://ws.comax.co.il/Comax_WebServices/", required = true)
    protected String atarDescription;
    @XmlElement(name = "Energia", namespace = "http://ws.comax.co.il/Comax_WebServices/")
    protected byte energia;
    @XmlElement(name = "Pahmemot", namespace = "http://ws.comax.co.il/Comax_WebServices/")
    protected byte pahmemot;
    @XmlElement(name = "Helbonim", namespace = "http://ws.comax.co.il/Comax_WebServices/")
    protected byte helbonim;
    @XmlElement(name = "Shumanim", namespace = "http://ws.comax.co.il/Comax_WebServices/")
    protected byte shumanim;
    @XmlElement(name = "Colestrol", namespace = "http://ws.comax.co.il/Comax_WebServices/")
    protected byte colestrol;
    @XmlElement(name = "MhrMivza", namespace = "http://ws.comax.co.il/Comax_WebServices/")
    protected byte mhrMivza;
    @XmlElement(name = "SwBonos", namespace = "http://ws.comax.co.il/Comax_WebServices/", required = true)
    protected String swBonos;
    @XmlElement(name = "BonosFline", namespace = "http://ws.comax.co.il/Comax_WebServices/")
    protected byte bonosFline;
    @XmlElement(name = "BonosTline", namespace = "http://ws.comax.co.il/Comax_WebServices/")
    protected byte bonosTline;
    @XmlElement(name = "Mirsham_PhrmaSoft", namespace = "http://ws.comax.co.il/Comax_WebServices/")
    protected byte mirshamPhrmaSoft;
    @XmlElement(name = "CustomerMakat", namespace = "http://ws.comax.co.il/Comax_WebServices/")
    protected byte customerMakat;
    @XmlElement(name = "QtyType", namespace = "http://ws.comax.co.il/Comax_WebServices/", required = true)
    protected String qtyType;
    @XmlElement(name = "NoDiscount", namespace = "http://ws.comax.co.il/Comax_WebServices/")
    protected byte noDiscount;
    @XmlElement(name = "PriceUSD", namespace = "http://ws.comax.co.il/Comax_WebServices/")
    protected byte priceUSD;
    @XmlElement(name = "PriceNIS", namespace = "http://ws.comax.co.il/Comax_WebServices/")
    protected byte priceNIS;
    @XmlElement(name = "WarrantySupplier", namespace = "http://ws.comax.co.il/Comax_WebServices/")
    protected byte warrantySupplier;
    @XmlElement(name = "WarrantyRemark", namespace = "http://ws.comax.co.il/Comax_WebServices/", required = true)
    protected String warrantyRemark;

    /**
     * Gets the value of the name property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the size property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSize(String value) {
        this.size = value;
    }

    /**
     * Gets the value of the id property.
     */
    public byte getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     */
    public void setID(byte value) {
        this.id = value;
    }

    /**
     * Gets the value of the oldID property.
     */
    public byte getOldID() {
        return oldID;
    }

    /**
     * Sets the value of the oldID property.
     */
    public void setOldID(byte value) {
        this.oldID = value;
    }

    /**
     * Gets the value of the barcode property.
     */
    public String getBarcode() {
        return barcode;
    }

    /**
     * Sets the value of the barcode property.
     */
    public void setBarcode(String value) {
        this.barcode = value;
    }

    /**
     * Gets the value of the purchasingAccountID property.
     */
    public byte getPurchasingAccountID() {
        return purchasingAccountID;
    }

    /**
     * Sets the value of the purchasingAccountID property.
     */
    public void setPurchasingAccountID(byte value) {
        this.purchasingAccountID = value;
    }

    /**
     * Gets the value of the salesAccountID property.
     */
    public byte getSalesAccountID() {
        return salesAccountID;
    }

    /**
     * Sets the value of the salesAccountID property.
     */
    public void setSalesAccountID(byte value) {
        this.salesAccountID = value;
    }

    /**
     * Gets the value of the alternateID property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAlternateID() {
        return alternateID;
    }

    /**
     * Sets the value of the alternateID property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAlternateID(String value) {
        this.alternateID = value;
    }

    /**
     * Gets the value of the workByAlternateID property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getWorkByAlternateID() {
        return workByAlternateID;
    }

    /**
     * Sets the value of the workByAlternateID property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setWorkByAlternateID(String value) {
        this.workByAlternateID = value;
    }

    /**
     * Gets the value of the serialNo property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSerialNo() {
        return serialNo;
    }

    /**
     * Sets the value of the serialNo property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSerialNo(String value) {
        this.serialNo = value;
    }

    /**
     * Gets the value of the price property.
     */
    public byte getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     */
    public void setPrice(byte value) {
        this.price = value;
    }

    /**
     * Gets the value of the quantity property.
     */
    public byte getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     */
    public void setQuantity(byte value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the discountPercent property.
     */
    public byte getDiscountPercent() {
        return discountPercent;
    }

    /**
     * Sets the value of the discountPercent property.
     */
    public void setDiscountPercent(byte value) {
        this.discountPercent = value;
    }

    /**
     * Gets the value of the discountTotal property.
     */
    public byte getDiscountTotal() {
        return discountTotal;
    }

    /**
     * Sets the value of the discountTotal property.
     */
    public void setDiscountTotal(byte value) {
        this.discountTotal = value;
    }

    /**
     * Gets the value of the totalSum property.
     */
    public byte getTotalSum() {
        return totalSum;
    }

    /**
     * Sets the value of the totalSum property.
     */
    public void setTotalSum(byte value) {
        this.totalSum = value;
    }

    /**
     * Gets the value of the maxQuantityInOrder property.
     */
    public byte getMaxQuantityInOrder() {
        return maxQuantityInOrder;
    }

    /**
     * Sets the value of the maxQuantityInOrder property.
     */
    public void setMaxQuantityInOrder(byte value) {
        this.maxQuantityInOrder = value;
    }

    /**
     * Gets the value of the correctionPrice property.
     */
    public byte getCorrectionPrice() {
        return correctionPrice;
    }

    /**
     * Sets the value of the correctionPrice property.
     */
    public void setCorrectionPrice(byte value) {
        this.correctionPrice = value;
    }

    /**
     * Gets the value of the correctionDiscountPercent property.
     */
    public byte getCorrectionDiscountPercent() {
        return correctionDiscountPercent;
    }

    /**
     * Sets the value of the correctionDiscountPercent property.
     */
    public void setCorrectionDiscountPercent(byte value) {
        this.correctionDiscountPercent = value;
    }

    /**
     * Gets the value of the correctionQuantity property.
     */
    public byte getCorrectionQuantity() {
        return correctionQuantity;
    }

    /**
     * Sets the value of the correctionQuantity property.
     */
    public void setCorrectionQuantity(byte value) {
        this.correctionQuantity = value;
    }

    /**
     * Gets the value of the conversionQuantity property.
     */
    public byte getConversionQuantity() {
        return conversionQuantity;
    }

    /**
     * Sets the value of the conversionQuantity property.
     */
    public void setConversionQuantity(byte value) {
        this.conversionQuantity = value;
    }

    /**
     * Gets the value of the superDepartment property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSuperDepartment() {
        return superDepartment;
    }

    /**
     * Sets the value of the superDepartment property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSuperDepartment(String value) {
        this.superDepartment = value;
    }

    /**
     * Gets the value of the superDepartmentCode property.
     */
    public byte getSuperDepartmentCode() {
        return superDepartmentCode;
    }

    /**
     * Sets the value of the superDepartmentCode property.
     */
    public void setSuperDepartmentCode(byte value) {
        this.superDepartmentCode = value;
    }

    /**
     * Gets the value of the department property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Sets the value of the department property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDepartment(String value) {
        this.department = value;
    }

    /**
     * Gets the value of the departmentCode property.
     */
    public byte getDepartmentCode() {
        return departmentCode;
    }

    /**
     * Sets the value of the departmentCode property.
     */
    public void setDepartmentCode(byte value) {
        this.departmentCode = value;
    }

    /**
     * Gets the value of the departmentEnglishName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDepartmentEnglishName() {
        return departmentEnglishName;
    }

    /**
     * Sets the value of the departmentEnglishName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDepartmentEnglishName(String value) {
        this.departmentEnglishName = value;
    }

    /**
     * Gets the value of the group property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getGroup() {
        return group;
    }

    /**
     * Sets the value of the group property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setGroup(String value) {
        this.group = value;
    }

    /**
     * Gets the value of the groupCode property.
     */
    public byte getGroupCode() {
        return groupCode;
    }

    /**
     * Sets the value of the groupCode property.
     */
    public void setGroupCode(byte value) {
        this.groupCode = value;
    }

    /**
     * Gets the value of the groupEnglishName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getGroupEnglishName() {
        return groupEnglishName;
    }

    /**
     * Sets the value of the groupEnglishName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setGroupEnglishName(String value) {
        this.groupEnglishName = value;
    }

    /**
     * Gets the value of the subGroup property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSubGroup() {
        return subGroup;
    }

    /**
     * Sets the value of the subGroup property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSubGroup(String value) {
        this.subGroup = value;
    }

    /**
     * Gets the value of the subGroupCode property.
     */
    public byte getSubGroupCode() {
        return subGroupCode;
    }

    /**
     * Sets the value of the subGroupCode property.
     */
    public void setSubGroupCode(byte value) {
        this.subGroupCode = value;
    }

    /**
     * Gets the value of the subGroupEnglishName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSubGroupEnglishName() {
        return subGroupEnglishName;
    }

    /**
     * Sets the value of the subGroupEnglishName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSubGroupEnglishName(String value) {
        this.subGroupEnglishName = value;
    }

    /**
     * Gets the value of the manufacturer property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * Sets the value of the manufacturer property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setManufacturer(String value) {
        this.manufacturer = value;
    }

    /**
     * Gets the value of the manufacturerCode property.
     */
    public byte getManufacturerCode() {
        return manufacturerCode;
    }

    /**
     * Sets the value of the manufacturerCode property.
     */
    public void setManufacturerCode(byte value) {
        this.manufacturerCode = value;
    }

    /**
     * Gets the value of the itemModel property.
     *
     * @return possible object is
     * {@link ItemModelType }
     */
    public ItemModelType getItemModel() {
        return itemModel;
    }

    /**
     * Sets the value of the itemModel property.
     *
     * @param value allowed object is
     *              {@link ItemModelType }
     */
    public void setItemModel(ItemModelType value) {
        this.itemModel = value;
    }

    /**
     * Gets the value of the itemColor property.
     *
     * @return possible object is
     * {@link ItemColorType }
     */
    public ItemColorType getItemColor() {
        return itemColor;
    }

    /**
     * Sets the value of the itemColor property.
     *
     * @param value allowed object is
     *              {@link ItemColorType }
     */
    public void setItemColor(ItemColorType value) {
        this.itemColor = value;
    }

    /**
     * Gets the value of the itemSize property.
     *
     * @return possible object is
     * {@link ItemSizeType }
     */
    public ItemSizeType getItemSize() {
        return itemSize;
    }

    /**
     * Sets the value of the itemSize property.
     *
     * @param value allowed object is
     *              {@link ItemSizeType }
     */
    public void setItemSize(ItemSizeType value) {
        this.itemSize = value;
    }

    /**
     * Gets the value of the attribute1 property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAttribute1() {
        return attribute1;
    }

    /**
     * Sets the value of the attribute1 property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAttribute1(String value) {
        this.attribute1 = value;
    }

    /**
     * Gets the value of the attribute1Code property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAttribute1Code() {
        return attribute1Code;
    }

    /**
     * Sets the value of the attribute1Code property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAttribute1Code(String value) {
        this.attribute1Code = value;
    }

    /**
     * Gets the value of the attribute2 property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAttribute2() {
        return attribute2;
    }

    /**
     * Sets the value of the attribute2 property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAttribute2(String value) {
        this.attribute2 = value;
    }

    /**
     * Gets the value of the attribute2Code property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAttribute2Code() {
        return attribute2Code;
    }

    /**
     * Sets the value of the attribute2Code property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAttribute2Code(String value) {
        this.attribute2Code = value;
    }

    /**
     * Gets the value of the attribute3 property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAttribute3() {
        return attribute3;
    }

    /**
     * Sets the value of the attribute3 property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAttribute3(String value) {
        this.attribute3 = value;
    }

    /**
     * Gets the value of the attribute3Code property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAttribute3Code() {
        return attribute3Code;
    }

    /**
     * Sets the value of the attribute3Code property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAttribute3Code(String value) {
        this.attribute3Code = value;
    }

    /**
     * Gets the value of the attribute4 property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAttribute4() {
        return attribute4;
    }

    /**
     * Sets the value of the attribute4 property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAttribute4(String value) {
        this.attribute4 = value;
    }

    /**
     * Gets the value of the attribute4Code property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAttribute4Code() {
        return attribute4Code;
    }

    /**
     * Sets the value of the attribute4Code property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAttribute4Code(String value) {
        this.attribute4Code = value;
    }

    /**
     * Gets the value of the attribute5 property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAttribute5() {
        return attribute5;
    }

    /**
     * Sets the value of the attribute5 property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAttribute5(String value) {
        this.attribute5 = value;
    }

    /**
     * Gets the value of the attribute5Code property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAttribute5Code() {
        return attribute5Code;
    }

    /**
     * Sets the value of the attribute5Code property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAttribute5Code(String value) {
        this.attribute5Code = value;
    }

    /**
     * Gets the value of the supplierID property.
     */
    public short getSupplierID() {
        return supplierID;
    }

    /**
     * Sets the value of the supplierID property.
     */
    public void setSupplierID(short value) {
        this.supplierID = value;
    }

    /**
     * Gets the value of the supplierName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSupplierName() {
        return supplierName;
    }

    /**
     * Sets the value of the supplierName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSupplierName(String value) {
        this.supplierName = value;
    }

    /**
     * Gets the value of the supplierCatalogNumber property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSupplierCatalogNumber() {
        return supplierCatalogNumber;
    }

    /**
     * Sets the value of the supplierCatalogNumber property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSupplierCatalogNumber(String value) {
        this.supplierCatalogNumber = value;
    }

    /**
     * Gets the value of the supplierPrice property.
     */
    public float getSupplierPrice() {
        return supplierPrice;
    }

    /**
     * Sets the value of the supplierPrice property.
     */
    public void setSupplierPrice(float value) {
        this.supplierPrice = value;
    }

    /**
     * Gets the value of the archiveDate property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getArchiveDate() {
        return archiveDate;
    }

    /**
     * Sets the value of the archiveDate property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setArchiveDate(String value) {
        this.archiveDate = value;
    }

    /**
     * Gets the value of the blockPurchaseDate property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getBlockPurchaseDate() {
        return blockPurchaseDate;
    }

    /**
     * Sets the value of the blockPurchaseDate property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setBlockPurchaseDate(String value) {
        this.blockPurchaseDate = value;
    }

    /**
     * Gets the value of the blockSalesDate property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getBlockSalesDate() {
        return blockSalesDate;
    }

    /**
     * Sets the value of the blockSalesDate property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setBlockSalesDate(String value) {
        this.blockSalesDate = value;
    }

    /**
     * Gets the value of the englishName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEnglishName() {
        return englishName;
    }

    /**
     * Sets the value of the englishName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEnglishName(String value) {
        this.englishName = value;
    }

    /**
     * Gets the value of the promoID property.
     */
    public byte getPromoID() {
        return promoID;
    }

    /**
     * Sets the value of the promoID property.
     */
    public void setPromoID(byte value) {
        this.promoID = value;
    }

    /**
     * Gets the value of the promoRank property.
     */
    public byte getPromoRank() {
        return promoRank;
    }

    /**
     * Sets the value of the promoRank property.
     */
    public void setPromoRank(byte value) {
        this.promoRank = value;
    }

    /**
     * Gets the value of the matchingItemID property.
     */
    public byte getMatchingItemID() {
        return matchingItemID;
    }

    /**
     * Sets the value of the matchingItemID property.
     */
    public void setMatchingItemID(byte value) {
        this.matchingItemID = value;
    }

    /**
     * Gets the value of the matchingItemQuantity property.
     */
    public byte getMatchingItemQuantity() {
        return matchingItemQuantity;
    }

    /**
     * Sets the value of the matchingItemQuantity property.
     */
    public void setMatchingItemQuantity(byte value) {
        this.matchingItemQuantity = value;
    }

    /**
     * Gets the value of the unitsQuantity property.
     */
    public byte getUnitsQuantity() {
        return unitsQuantity;
    }

    /**
     * Sets the value of the unitsQuantity property.
     */
    public void setUnitsQuantity(byte value) {
        this.unitsQuantity = value;
    }

    /**
     * Gets the value of the length property.
     */
    public byte getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     */
    public void setLength(byte value) {
        this.length = value;
    }

    /**
     * Gets the value of the lengthSize property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLengthSize() {
        return lengthSize;
    }

    /**
     * Sets the value of the lengthSize property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLengthSize(String value) {
        this.lengthSize = value;
    }

    /**
     * Gets the value of the width property.
     */
    public byte getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     */
    public void setWidth(byte value) {
        this.width = value;
    }

    /**
     * Gets the value of the widthSize property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getWidthSize() {
        return widthSize;
    }

    /**
     * Sets the value of the widthSize property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setWidthSize(String value) {
        this.widthSize = value;
    }

    /**
     * Gets the value of the height property.
     */
    public byte getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     */
    public void setHeight(byte value) {
        this.height = value;
    }

    /**
     * Gets the value of the heightSize property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getHeightSize() {
        return heightSize;
    }

    /**
     * Sets the value of the heightSize property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setHeightSize(String value) {
        this.heightSize = value;
    }

    /**
     * Gets the value of the weight property.
     */
    public byte getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     */
    public void setWeight(byte value) {
        this.weight = value;
    }

    /**
     * Gets the value of the weightSize property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getWeightSize() {
        return weightSize;
    }

    /**
     * Sets the value of the weightSize property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setWeightSize(String value) {
        this.weightSize = value;
    }

    /**
     * Gets the value of the picURL property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPicURL() {
        return picURL;
    }

    /**
     * Sets the value of the picURL property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPicURL(String value) {
        this.picURL = value;
    }

    /**
     * Gets the value of the currentStoreID property.
     */
    public byte getCurrentStoreID() {
        return currentStoreID;
    }

    /**
     * Sets the value of the currentStoreID property.
     */
    public void setCurrentStoreID(byte value) {
        this.currentStoreID = value;
    }

    /**
     * Gets the value of the baseLine property.
     */
    public byte getBaseLine() {
        return baseLine;
    }

    /**
     * Sets the value of the baseLine property.
     */
    public void setBaseLine(byte value) {
        this.baseLine = value;
    }

    /**
     * Gets the value of the baseDocNumber property.
     */
    public byte getBaseDocNumber() {
        return baseDocNumber;
    }

    /**
     * Sets the value of the baseDocNumber property.
     */
    public void setBaseDocNumber(byte value) {
        this.baseDocNumber = value;
    }

    /**
     * Gets the value of the baseReference property.
     */
    public byte getBaseReference() {
        return baseReference;
    }

    /**
     * Sets the value of the baseReference property.
     */
    public void setBaseReference(byte value) {
        this.baseReference = value;
    }

    /**
     * Gets the value of the baseYear property.
     */
    public byte getBaseYear() {
        return baseYear;
    }

    /**
     * Sets the value of the baseYear property.
     */
    public void setBaseYear(byte value) {
        this.baseYear = value;
    }

    /**
     * Gets the value of the conversion property.
     */
    public byte getConversion() {
        return conversion;
    }

    /**
     * Sets the value of the conversion property.
     */
    public void setConversion(byte value) {
        this.conversion = value;
    }

    /**
     * Gets the value of the additionalConversion property.
     */
    public byte getAdditionalConversion() {
        return additionalConversion;
    }

    /**
     * Sets the value of the additionalConversion property.
     */
    public void setAdditionalConversion(byte value) {
        this.additionalConversion = value;
    }

    /**
     * Gets the value of the notShowInWeb property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getNotShowInWeb() {
        return notShowInWeb;
    }

    /**
     * Sets the value of the notShowInWeb property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNotShowInWeb(String value) {
        this.notShowInWeb = value;
    }

    /**
     * Gets the value of the setModelProperties property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSetModelProperties() {
        return setModelProperties;
    }

    /**
     * Sets the value of the setModelProperties property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSetModelProperties(String value) {
        this.setModelProperties = value;
    }

    /**
     * Gets the value of the hierarchyUpdate property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getHierarchyUpdate() {
        return hierarchyUpdate;
    }

    /**
     * Sets the value of the hierarchyUpdate property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setHierarchyUpdate(String value) {
        this.hierarchyUpdate = value;
    }

    /**
     * Gets the value of the downloadPriceTransparencyAfter48Hours property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDownloadPriceTransparencyAfter48Hours() {
        return downloadPriceTransparencyAfter48Hours;
    }

    /**
     * Sets the value of the downloadPriceTransparencyAfter48Hours property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDownloadPriceTransparencyAfter48Hours(String value) {
        this.downloadPriceTransparencyAfter48Hours = value;
    }

    /**
     * Gets the value of the itemData property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getItemData() {
        return itemData;
    }

    /**
     * Sets the value of the itemData property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setItemData(String value) {
        this.itemData = value;
    }

    /**
     * Gets the value of the rejectTypeID property.
     */
    public byte getRejectTypeID() {
        return rejectTypeID;
    }

    /**
     * Sets the value of the rejectTypeID property.
     */
    public void setRejectTypeID(byte value) {
        this.rejectTypeID = value;
    }

    /**
     * Gets the value of the openDate property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getOpenDate() {
        return openDate;
    }

    /**
     * Sets the value of the openDate property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setOpenDate(String value) {
        this.openDate = value;
    }

    /**
     * Gets the value of the warrantyMonths property.
     */
    public byte getWarrantyMonths() {
        return warrantyMonths;
    }

    /**
     * Sets the value of the warrantyMonths property.
     */
    public void setWarrantyMonths(byte value) {
        this.warrantyMonths = value;
    }

    /**
     * Gets the value of the ingredients property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getIngredients() {
        return ingredients;
    }

    /**
     * Sets the value of the ingredients property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setIngredients(String value) {
        this.ingredients = value;
    }

    /**
     * Gets the value of the fullIngredientsReplace property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getFullIngredientsReplace() {
        return fullIngredientsReplace;
    }

    /**
     * Sets the value of the fullIngredientsReplace property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFullIngredientsReplace(String value) {
        this.fullIngredientsReplace = value;
    }

    /**
     * Gets the value of the cmtAmara property.
     */
    public byte getCmtAmara() {
        return cmtAmara;
    }

    /**
     * Sets the value of the cmtAmara property.
     */
    public void setCmtAmara(byte value) {
        this.cmtAmara = value;
    }

    /**
     * Gets the value of the amaraBy property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAmaraBy() {
        return amaraBy;
    }

    /**
     * Sets the value of the amaraBy property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAmaraBy(String value) {
        this.amaraBy = value;
    }

    /**
     * Gets the value of the cmtAmara2 property.
     */
    public byte getCmtAmara2() {
        return cmtAmara2;
    }

    /**
     * Sets the value of the cmtAmara2 property.
     */
    public void setCmtAmara2(byte value) {
        this.cmtAmara2 = value;
    }

    /**
     * Gets the value of the internalAmara property.
     */
    public byte getInternalAmara() {
        return internalAmara;
    }

    /**
     * Sets the value of the internalAmara property.
     */
    public void setInternalAmara(byte value) {
        this.internalAmara = value;
    }

    /**
     * Gets the value of the line property.
     */
    public byte getLine() {
        return line;
    }

    /**
     * Sets the value of the line property.
     */
    public void setLine(byte value) {
        this.line = value;
    }

    /**
     * Gets the value of the lengthOptic property.
     */
    public byte getLengthOptic() {
        return lengthOptic;
    }

    /**
     * Sets the value of the lengthOptic property.
     */
    public void setLengthOptic(byte value) {
        this.lengthOptic = value;
    }

    /**
     * Gets the value of the diagonalOptic property.
     */
    public byte getDiagonalOptic() {
        return diagonalOptic;
    }

    /**
     * Sets the value of the diagonalOptic property.
     */
    public void setDiagonalOptic(byte value) {
        this.diagonalOptic = value;
    }

    /**
     * Gets the value of the heightOptic property.
     */
    public byte getHeightOptic() {
        return heightOptic;
    }

    /**
     * Sets the value of the heightOptic property.
     */
    public void setHeightOptic(byte value) {
        this.heightOptic = value;
    }

    /**
     * Gets the value of the nameInWeb property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getNameInWeb() {
        return nameInWeb;
    }

    /**
     * Sets the value of the nameInWeb property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNameInWeb(String value) {
        this.nameInWeb = value;
    }

    /**
     * Gets the value of the nosafKod2 property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getNosafKod2() {
        return nosafKod2;
    }

    /**
     * Sets the value of the nosafKod2 property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNosafKod2(String value) {
        this.nosafKod2 = value;
    }

    /**
     * Gets the value of the nosafNm2 property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getNosafNm2() {
        return nosafNm2;
    }

    /**
     * Sets the value of the nosafNm2 property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNosafNm2(String value) {
        this.nosafNm2 = value;
    }

    /**
     * Gets the value of the nosafKod3 property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getNosafKod3() {
        return nosafKod3;
    }

    /**
     * Sets the value of the nosafKod3 property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNosafKod3(String value) {
        this.nosafKod3 = value;
    }

    /**
     * Gets the value of the nosafNm3 property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getNosafNm3() {
        return nosafNm3;
    }

    /**
     * Sets the value of the nosafNm3 property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNosafNm3(String value) {
        this.nosafNm3 = value;
    }

    /**
     * Gets the value of the atarDescription property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAtarDescription() {
        return atarDescription;
    }

    /**
     * Sets the value of the atarDescription property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAtarDescription(String value) {
        this.atarDescription = value;
    }

    /**
     * Gets the value of the energia property.
     */
    public byte getEnergia() {
        return energia;
    }

    /**
     * Sets the value of the energia property.
     */
    public void setEnergia(byte value) {
        this.energia = value;
    }

    /**
     * Gets the value of the pahmemot property.
     */
    public byte getPahmemot() {
        return pahmemot;
    }

    /**
     * Sets the value of the pahmemot property.
     */
    public void setPahmemot(byte value) {
        this.pahmemot = value;
    }

    /**
     * Gets the value of the helbonim property.
     */
    public byte getHelbonim() {
        return helbonim;
    }

    /**
     * Sets the value of the helbonim property.
     */
    public void setHelbonim(byte value) {
        this.helbonim = value;
    }

    /**
     * Gets the value of the shumanim property.
     */
    public byte getShumanim() {
        return shumanim;
    }

    /**
     * Sets the value of the shumanim property.
     */
    public void setShumanim(byte value) {
        this.shumanim = value;
    }

    /**
     * Gets the value of the colestrol property.
     */
    public byte getColestrol() {
        return colestrol;
    }

    /**
     * Sets the value of the colestrol property.
     */
    public void setColestrol(byte value) {
        this.colestrol = value;
    }

    /**
     * Gets the value of the mhrMivza property.
     */
    public byte getMhrMivza() {
        return mhrMivza;
    }

    /**
     * Sets the value of the mhrMivza property.
     */
    public void setMhrMivza(byte value) {
        this.mhrMivza = value;
    }

    /**
     * Gets the value of the swBonos property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSwBonos() {
        return swBonos;
    }

    /**
     * Sets the value of the swBonos property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSwBonos(String value) {
        this.swBonos = value;
    }

    /**
     * Gets the value of the bonosFline property.
     */
    public byte getBonosFline() {
        return bonosFline;
    }

    /**
     * Sets the value of the bonosFline property.
     */
    public void setBonosFline(byte value) {
        this.bonosFline = value;
    }

    /**
     * Gets the value of the bonosTline property.
     */
    public byte getBonosTline() {
        return bonosTline;
    }

    /**
     * Sets the value of the bonosTline property.
     */
    public void setBonosTline(byte value) {
        this.bonosTline = value;
    }

    /**
     * Gets the value of the mirshamPhrmaSoft property.
     */
    public byte getMirshamPhrmaSoft() {
        return mirshamPhrmaSoft;
    }

    /**
     * Sets the value of the mirshamPhrmaSoft property.
     */
    public void setMirshamPhrmaSoft(byte value) {
        this.mirshamPhrmaSoft = value;
    }

    /**
     * Gets the value of the customerMakat property.
     */
    public byte getCustomerMakat() {
        return customerMakat;
    }

    /**
     * Sets the value of the customerMakat property.
     */
    public void setCustomerMakat(byte value) {
        this.customerMakat = value;
    }

    /**
     * Gets the value of the qtyType property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getQtyType() {
        return qtyType;
    }

    /**
     * Sets the value of the qtyType property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setQtyType(String value) {
        this.qtyType = value;
    }

    /**
     * Gets the value of the noDiscount property.
     */
    public byte getNoDiscount() {
        return noDiscount;
    }

    /**
     * Sets the value of the noDiscount property.
     */
    public void setNoDiscount(byte value) {
        this.noDiscount = value;
    }

    /**
     * Gets the value of the priceUSD property.
     */
    public byte getPriceUSD() {
        return priceUSD;
    }

    /**
     * Sets the value of the priceUSD property.
     */
    public void setPriceUSD(byte value) {
        this.priceUSD = value;
    }

    /**
     * Gets the value of the priceNIS property.
     */
    public byte getPriceNIS() {
        return priceNIS;
    }

    /**
     * Sets the value of the priceNIS property.
     */
    public void setPriceNIS(byte value) {
        this.priceNIS = value;
    }

    /**
     * Gets the value of the warrantySupplier property.
     */
    public byte getWarrantySupplier() {
        return warrantySupplier;
    }

    /**
     * Sets the value of the warrantySupplier property.
     */
    public void setWarrantySupplier(byte value) {
        this.warrantySupplier = value;
    }

    /**
     * Gets the value of the warrantyRemark property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getWarrantyRemark() {
        return warrantyRemark;
    }

    /**
     * Sets the value of the warrantyRemark property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setWarrantyRemark(String value) {
        this.warrantyRemark = value;
    }

}
