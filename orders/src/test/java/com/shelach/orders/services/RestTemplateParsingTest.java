package com.shelach.orders.services;

import com.shelach.orders.OrdersApplication;
import com.shelach.orders.comax.generated.pricesresult.GetAllItemsPricesByParamsResponse;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.client.MockRestServiceServer;
import org.springframework.test.web.client.match.MockRestRequestMatchers;
import org.springframework.test.web.client.response.MockRestResponseCreators;
import org.springframework.web.client.RestTemplate;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = OrdersApplication.class)
@TestPropertySource(properties = {"comax.username=login", "comax.password=dummyPass"})

class RestTemplateParsingTest {

    @Autowired
    RestTemplate restTemplate;
    MockRestServiceServer mockRestServiceServer;

    @BeforeEach
    private void setup() {
        mockRestServiceServer = MockRestServiceServer.createServer(restTemplate);
    }


    @Test
    void getAllItemsPricesIsParsedCorrectly() {
        mockRestServiceServer.expect(MockRestRequestMatchers.anything()).andRespond(MockRestResponseCreators.withSuccess(getClassItemsSalePricesResult(), MediaType.APPLICATION_ATOM_XML));
        GetAllItemsPricesByParamsResponse result = restTemplate.getForObject("https://amit.com/", GetAllItemsPricesByParamsResponse.class);
        mockRestServiceServer.verify();
        //noinspection ConstantConditions
        assertThat(result.getGetAllItemsPricesByParamsResult().getClsItemsSalePrices().get(0).getName()).isEqualTo("AmitItemName");
    }

    private String getClassItemsSalePricesResult() {
        return "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<soap:Envelope xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\">\n" +
                "\t<soap:Body>\n" +
                "\t\t<Get_AllItemsPricesByParamsResponse xmlns=\"http://ws.comax.co.il/Comax_WebServices/\">\n" +
                "\t\t\t<Get_AllItemsPricesByParamsResult>\n" +
                "\t\t\t\t<ClsItemsSalePrices>\n" +
                "\t\t\t\t\t<Name>AmitItemName</Name>\n" +
                "\t\t\t\t\t<ID>0</ID>\n" +
                "\t\t\t\t\t<Barcode>0</Barcode>\n" +
                "\t\t\t\t\t<AlternateID />\n" +
                "\t\t\t\t\t<SalesPrice>\n" +
                "\t\t\t\t\t\t<ClsItemPrices>\n" +
                "\t\t\t\t\t\t\t<PriceListID>7525</PriceListID>\n" +
                "\t\t\t\t\t\t\t<Currency />\n" +
                "\t\t\t\t\t\t\t<IsIncludeVat>false</IsIncludeVat>\n" +
                "\t\t\t\t\t\t\t<Price>19.7</Price>\n" +
                "\t\t\t\t\t\t\t<NetPrice>19.7</NetPrice>\n" +
                "\t\t\t\t\t\t</ClsItemPrices>\n" +
                "\t\t\t\t\t\t<ClsItemPrices>\n" +
                "\t\t\t\t\t\t\t<PriceListID>99999</PriceListID>\n" +
                "\t\t\t\t\t\t\t<Currency />\n" +
                "\t\t\t\t\t\t\t<IsIncludeVat>false</IsIncludeVat>\n" +
                "\t\t\t\t\t\t\t<Price>19.7</Price>\n" +
                "\t\t\t\t\t\t\t<NetPrice>19.7</NetPrice>\n" +
                "\t\t\t\t\t\t</ClsItemPrices>\n" +
                "\t\t\t\t\t\t<ClsItemPrices>\n" +
                "\t\t\t\t\t\t\t<PriceListID>12</PriceListID>\n" +
                "\t\t\t\t\t\t\t<Currency />\n" +
                "\t\t\t\t\t\t\t<IsIncludeVat>true</IsIncludeVat>\n" +
                "\t\t\t\t\t\t\t<Price>29.9</Price>\n" +
                "\t\t\t\t\t\t\t<NetPrice>29.9</NetPrice>\n" +
                "\t\t\t\t\t\t</ClsItemPrices>\n" +
                "\t\t\t\t\t</SalesPrice>\n" +
                "\t\t\t\t</ClsItemsSalePrices>" +
                "\t\t\t</Get_AllItemsPricesByParamsResult>\n" +
                "\t\t</Get_AllItemsPricesByParamsResponse>\n" +
                "\t</soap:Body>\n" +
                "</soap:Envelope>";
    }


}