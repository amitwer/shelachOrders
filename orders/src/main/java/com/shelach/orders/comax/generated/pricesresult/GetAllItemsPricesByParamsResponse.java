
package com.shelach.orders.comax.generated.pricesresult;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Get_AllItemsPricesByParamsResponse complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Get_AllItemsPricesByParamsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Get_AllItemsPricesByParamsResult" type="{http://ws.comax.co.il/Comax_WebServices/}Get_AllItemsPricesByParamsResult"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Get_AllItemsPricesByParamsResponse", propOrder = {
        "getAllItemsPricesByParamsResult"
})
public class GetAllItemsPricesByParamsResponse {

    @XmlElement(name = "Get_AllItemsPricesByParamsResult", required = true)
    protected GetAllItemsPricesByParamsResult getAllItemsPricesByParamsResult;

    /**
     * Gets the value of the getAllItemsPricesByParamsResult property.
     *
     * @return possible object is
     * {@link GetAllItemsPricesByParamsResult }
     */
    public GetAllItemsPricesByParamsResult getGetAllItemsPricesByParamsResult() {
        return getAllItemsPricesByParamsResult;
    }

    /**
     * Sets the value of the getAllItemsPricesByParamsResult property.
     *
     * @param value allowed object is
     *              {@link GetAllItemsPricesByParamsResult }
     */
    public void setGetAllItemsPricesByParamsResult(GetAllItemsPricesByParamsResult value) {
        this.getAllItemsPricesByParamsResult = value;
    }

}
