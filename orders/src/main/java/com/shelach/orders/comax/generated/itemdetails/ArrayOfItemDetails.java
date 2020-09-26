
package com.shelach.orders.comax.generated.itemdetails;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ArrayOfClsItemsType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ArrayOfClsItemsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClsItems" type="{http://ws.comax.co.il/Comax_WebServices/}ClsItemsType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfClsItemsType", namespace = "http://ws.comax.co.il/Comax_WebServices/", propOrder = {
        "clsItems"
})
public class ArrayOfItemDetails {

    @XmlElement(name = "ClsItems", namespace = "http://ws.comax.co.il/Comax_WebServices/")
    protected List<ItemDetails> clsItems;

    /**
     * Gets the value of the clsItems property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clsItems property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClsItems().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemDetails }
     */
    public List<ItemDetails> getClsItems() {
        if (clsItems == null) {
            clsItems = new ArrayList<>();
        }
        return this.clsItems;
    }

}
