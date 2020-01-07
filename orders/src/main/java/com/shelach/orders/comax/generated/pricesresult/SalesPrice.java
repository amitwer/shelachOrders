
package com.shelach.orders.comax.generated.pricesresult;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for SalesPrice complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="SalesPrice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClsItemPrices" type="{http://ws.comax.co.il/Comax_WebServices/}ClsItemPrices" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesPrice", propOrder = {
        "clsItemPrices"
})
public class SalesPrice {

    @XmlElement(name = "ClsItemPrices")
    protected List<ClsItemPrices> clsItemPrices;

    /**
     * Gets the value of the clsItemPrices property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clsItemPrices property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClsItemPrices().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClsItemPrices }
     */
    public List<ClsItemPrices> getClsItemPrices() {
        if (clsItemPrices == null) {
            clsItemPrices = new ArrayList<ClsItemPrices>();
        }
        return this.clsItemPrices;
    }

}
