
package com.shelach.orders.comax.generated.pricesresult;

import lombok.ToString;

import javax.xml.bind.annotation.*;


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
@ToString
@XmlRootElement(name = "Get_AllItemsPricesByParamsResponse")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Get_AllItemsPricesByParamsResponse", propOrder = {
        "getAllItemsPricesByParamsResult"
})
public class GetAllItemsPricesByParamsResponse {

    @XmlElement(name = "Get_AllItemsPricesByParamsResult", required = true)
    protected GetAllItemsPricesByParamsResult getAllItemsPricesByParamsResult;

    @XmlAttribute
    private String xmlns;

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

    public String getXmlns() {
        return xmlns;
    }

    public void setXmlns(String xmlns) {
        this.xmlns = xmlns;
    }
}
