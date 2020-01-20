package com.shelach.orders.services;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.client.MockRestServiceServer;
import org.springframework.test.web.client.match.MockRestRequestMatchers;
import org.springframework.test.web.client.response.MockRestResponseCreators;
import org.springframework.web.client.RestTemplate;

@Slf4j
@ExtendWith(SpringExtension.class)
class RestTemplateParsingTest {
    RestTemplate restTemplate;
    MockRestServiceServer mockRestServiceServer;

    @BeforeEach
    private void setup() {
        restTemplate = new RestTemplate();
        mockRestServiceServer = MockRestServiceServer.createServer(restTemplate);
    }


    @Test
    void getAllItemsPricesIsParsedCorrectly(){
        String response = getClassItemsSalePricesResult();
        mockRestServiceServer.expect(MockRestRequestMatchers.anything()).andRespond(MockRestResponseCreators.withSuccess(getClassItemsSalePricesResult(), MediaType.APPLICATION_ATOM_XML));
        String result = restTemplate.getForObject("https://amit.com/", String.class);
        log.info("Response is  {}", result);
        mockRestServiceServer.verify();
    }

    private String getClassItemsSalePricesResult() {
        return "\n" +
                "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<ArrayOfClsItemsSalePrices xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns=\"http://ws.comax.co.il/Comax_WebServices/\">\n" +
                "  <ClsItemsSalePrices>\n" +
                "    <Name>עע</Name>\n" +
                "    <ID>0</ID>\n" +
                "    <Barcode>0</Barcode>\n" +
                "    <AlternateID />\n" +
                "    <SalesPrice>\n" +
                "      <ClsItemPrices>\n" +
                "        <PriceListID>7525</PriceListID>\n" +
                "        <Currency />\n" +
                "        <IsIncludeVat>false</IsIncludeVat>\n" +
                "        <Price>19.7</Price>\n" +
                "        <NetPrice>19.7</NetPrice>\n" +
                "      </ClsItemPrices>\n" +
                "      <ClsItemPrices>\n" +
                "        <PriceListID>99999</PriceListID>\n" +
                "        <Currency />\n" +
                "        <IsIncludeVat>false</IsIncludeVat>\n" +
                "        <Price>19.7</Price>\n" +
                "        <NetPrice>19.7</NetPrice>\n" +
                "      </ClsItemPrices>\n" +
                "      <ClsItemPrices>\n" +
                "        <PriceListID>12</PriceListID>\n" +
                "        <Currency />\n" +
                "        <IsIncludeVat>true</IsIncludeVat>\n" +
                "        <Price>29.9</Price>\n" +
                "        <NetPrice>29.9</NetPrice>\n" +
                "      </ClsItemPrices>\n" +
                "    </SalesPrice>\n" +
                "  </ClsItemsSalePrices>\n" +
                "  <ClsItemsSalePrices>\n" +
                "    <Name>מיני שוקולד עלית</Name>\n" +
                "    <ID>1</ID>\n" +
                "    <Barcode>1</Barcode>\n" +
                "    <AlternateID />\n" +
                "    <SalesPrice>\n" +
                "      <ClsItemPrices>\n" +
                "        <PriceListID>11</PriceListID>\n" +
                "        <Currency />\n" +
                "        <IsIncludeVat>true</IsIncludeVat>\n" +
                "        <Price>0.7</Price>\n" +
                "        <NetPrice>0.7</NetPrice>\n" +
                "      </ClsItemPrices>\n" +
                "      <ClsItemPrices>\n" +
                "        <PriceListID>13</PriceListID>\n" +
                "        <Currency />\n" +
                "        <IsIncludeVat>true</IsIncludeVat>\n" +
                "        <Price>0.7</Price>\n" +
                "        <NetPrice>0.7</NetPrice>\n" +
                "      </ClsItemPrices>\n" +
                "      <ClsItemPrices>\n" +
                "        <PriceListID>12</PriceListID>\n" +
                "        <Currency />\n" +
                "        <IsIncludeVat>true</IsIncludeVat>\n" +
                "        <Price>1.5</Price>\n" +
                "        <NetPrice>1.5</NetPrice>\n" +
                "      </ClsItemPrices>\n" +
                "      <ClsItemPrices>\n" +
                "        <PriceListID>5025</PriceListID>\n" +
                "        <Currency />\n" +
                "        <IsIncludeVat>false</IsIncludeVat>\n" +
                "        <Price>9</Price>\n" +
                "        <NetPrice>9</NetPrice>\n" +
                "      </ClsItemPrices>\n" +
                "      <ClsItemPrices>\n" +
                "        <PriceListID>99999</PriceListID>\n" +
                "        <Currency />\n" +
                "        <IsIncludeVat>false</IsIncludeVat>\n" +
                "        <Price>12.2902</Price>\n" +
                "        <NetPrice>10.078</NetPrice>\n" +
                "      </ClsItemPrices>\n" +
                "    </SalesPrice>\n" +
                "  </ClsItemsSalePrices>\n" +
                "  <ClsItemsSalePrices>\n" +
                "    <Name>מחית תינוקות בטעמים</Name>\n" +
                "    <ID>2</ID>\n" +
                "    <Barcode>2</Barcode>\n" +
                "    <AlternateID />\n" +
                "    <SalesPrice>\n" +
                "      <ClsItemPrices>\n" +
                "        <PriceListID>5051</PriceListID>\n" +
                "        <Currency />\n" +
                "        <IsIncludeVat>false</IsIncludeVat>\n" +
                "        <Price>1.64</Price>\n" +
                "        <NetPrice>1.64</NetPrice>\n" +
                "      </ClsItemPrices>\n" +
                "      <ClsItemPrices>\n" +
                "        <PriceListID>4602</PriceListID>\n" +
                "        <Currency />\n" +
                "        <IsIncludeVat>false</IsIncludeVat>\n" +
                "        <Price>2</Price>\n" +
                "        <NetPrice>2</NetPrice>\n" +
                "      </ClsItemPrices>\n" +
                "      <ClsItemPrices>\n" +
                "        <PriceListID>5008</PriceListID>\n" +
                "        <Currency />\n" +
                "        <IsIncludeVat>false</IsIncludeVat>\n" +
                "        <Price>2</Price>\n" +
                "        <NetPrice>2</NetPrice>\n" +
                "      </ClsItemPrices>\n" +
                "      <ClsItemPrices>\n" +
                "        <PriceListID>4700</PriceListID>\n" +
                "        <Currency />\n" +
                "        <IsIncludeVat>false</IsIncludeVat>\n" +
                "        <Price>2.02</Price>\n" +
                "        <NetPrice>2.02</NetPrice>\n" +
                "      </ClsItemPrices>\n" +
                "      <ClsItemPrices>\n" +
                "        <PriceListID>4400</PriceListID>\n" +
                "        <Currency />\n" +
                "        <IsIncludeVat>false</IsIncludeVat>\n" +
                "        <Price>2.04</Price>\n" +
                "        <NetPrice>2.04</NetPrice>\n" +
                "      </ClsItemPrices>\n" +
                "      <ClsItemPrices>\n" +
                "        <PriceListID>4500</PriceListID>\n" +
                "        <Currency />\n" +
                "        <IsIncludeVat>false</IsIncludeVat>\n" +
                "        <Price>2.06</Price>\n" +
                "        <NetPrice>2.06</NetPrice>\n" +
                "      </ClsItemPrices>\n" +
                "      <ClsItemPrices>\n" +
                "        <PriceListID>4107</PriceListID>\n" +
                "        <Currency />\n" +
                "        <IsIncludeVat>false</IsIncludeVat>\n" +
                "        <Price>2.38</Price>\n" +
                "        <NetPrice>2.38</NetPrice>\n" +
                "      </ClsItemPrices>\n" +
                "      <ClsItemPrices>\n" +
                "        <PriceListID>4200</PriceListID>\n" +
                "        <Currency />\n" +
                "        <IsIncludeVat>false</IsIncludeVat>\n" +
                "        <Price>2.39</Price>\n" +
                "        <NetPrice>2.39</NetPrice>\n" +
                "      </ClsItemPrices>\n" +
                "      <ClsItemPrices>\n" +
                "        <PriceListID>4600</PriceListID>\n" +
                "        <Currency />\n" +
                "        <IsIncludeVat>false</IsIncludeVat>\n" +
                "        <Price>2.42</Price>\n" +
                "        <NetPrice>2.42</NetPrice>\n" +
                "      </ClsItemPrices>" +
                "  </ClsItemsSalePrices>\n" +
                "</ArrayOfClsItemsSalePrices>";
    }


}