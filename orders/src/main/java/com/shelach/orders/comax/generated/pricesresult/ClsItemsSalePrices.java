package com.shelach.orders.comax.generated.pricesresult;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClsItemsSalePrices complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ClsItemsSalePrices">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="Barcode" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="AlternateID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SalesPrice" type="{http://ws.comax.co.il/Comax_WebServices/}SalesPrice"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClsItemsSalePrices", propOrder = {
        "name",
        "id",
        "barcode",
        "alternateID",
        "salesPrice"
})
public class ClsItemsSalePrices {

    @XmlElement(name = "Name", required = true)
    private String name;
    @XmlElement(name = "ID")
    private byte id;
    @XmlElement(name = "Barcode")
    private String barcode;
    @XmlElement(name = "AlternateID", required = true)
    private String alternateID;
    @XmlElement(name = "SalesPrice", required = true)
    private SalesPrice salesPrice;

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
     * Gets the value of the barcode property.
     */
    public String getBarcode() {
        return barcode;
    }

    /**
     * Sets the value of the barcode property.
     *
     * @param value
     */
    public void setBarcode(String value) {
        this.barcode = value;
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
     * Gets the value of the salesPrice property.
     *
     * @return possible object is
     * {@link SalesPrice }
     */
    public SalesPrice getSalesPrice() {
        return salesPrice;
    }

    /**
     * Sets the value of the salesPrice property.
     *
     * @param value allowed object is
     *              {@link SalesPrice }
     */
    public void setSalesPrice(SalesPrice value) {
        this.salesPrice = value;
    }

}
