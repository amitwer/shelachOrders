
package com.shelach.orders.comax.generated.pricesresult;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClsItemPrices complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ClsItemPrices">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PriceListID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IsIncludeVat" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="NetPrice" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClsItemPrices", propOrder = {
        "priceListID",
        "currency",
        "isIncludeVat",
        "price",
        "netPrice"
})
public class ClsItemPrices {

    @XmlElement(name = "PriceListID")
    protected int priceListID;
    @XmlElement(name = "Currency", required = true)
    protected String currency;
    @XmlElement(name = "IsIncludeVat", required = true)
    protected String isIncludeVat;
    @XmlElement(name = "Price")
    protected float price;
    @XmlElement(name = "NetPrice")
    protected float netPrice;

    /**
     * Gets the value of the priceListID property.
     */
    public int getPriceListID() {
        return priceListID;
    }

    /**
     * Sets the value of the priceListID property.
     */
    public void setPriceListID(int value) {
        this.priceListID = value;
    }

    /**
     * Gets the value of the currency property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the isIncludeVat property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getIsIncludeVat() {
        return isIncludeVat;
    }

    /**
     * Sets the value of the isIncludeVat property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setIsIncludeVat(String value) {
        this.isIncludeVat = value;
    }

    /**
     * Gets the value of the price property.
     */
    public float getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     */
    public void setPrice(float value) {
        this.price = value;
    }

    /**
     * Gets the value of the netPrice property.
     */
    public float getNetPrice() {
        return netPrice;
    }

    /**
     * Sets the value of the netPrice property.
     */
    public void setNetPrice(float value) {
        this.netPrice = value;
    }

}
