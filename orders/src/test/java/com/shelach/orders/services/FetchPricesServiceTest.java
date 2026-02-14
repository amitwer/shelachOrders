package com.shelach.orders.services;

import com.shelach.orders.comax.generated.pricesresult.*;
import com.shelach.orders.data.Order;
import org.apache.commons.lang3.RandomStringUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.util.Lists.list;
import static org.mockito.Mockito.*;

class FetchPricesServiceTest {
    private static final String EXPECTED_USER = "DummyUser";
    private static final String EXPECTED_PASSWORD = "DummyPass";
    private FetchPricesService fetchPricesService;
    private RestTemplate mockRestTemplate;

    @Test
    void fetchPricesCallsComaxWithCorrectParameters() {
        when(mockRestTemplate.postForEntity(anyString(), any(), any())).thenReturn(mockResponse(list(1)));
        @SuppressWarnings("unchecked")
        ArgumentCaptor<HttpEntity<String>> captor = ArgumentCaptor.forClass(HttpEntity.class);
        fetchPricesService.getAllPrices();
        verify(mockRestTemplate, times(1)).postForEntity(anyString(), captor.capture(), eq(GetAllItemsPricesByParamsResponse.class));

        HttpEntity<String> request = captor.getValue();
        Document parsedBody = Jsoup.parse(request.getBody(), "", Parser.xmlParser());
        Elements soapRequest = parsedBody.getElementsByTag("Get_AllItemsPricesByParams");
        assertThat(soapRequest).hasSize(1);
        assertThat(parsedBody.getElementsByTag("LoginID").text()).isNotNull().isEqualTo(EXPECTED_USER);
        assertThat(parsedBody.getElementsByTag("LoginPassword").text()).isNotNull().isEqualTo(EXPECTED_PASSWORD);
    }

    @BeforeEach
    void setUp() {
        mockRestTemplate = Mockito.mock(RestTemplate.class);
        fetchPricesService = new FetchPricesService(mockRestTemplate, new ComaxCredentialsProvider(EXPECTED_USER, EXPECTED_PASSWORD), "https://dummyUrl");
    }

    @Test
    void fetchPricesReturnsPricePerListId() {
        List<Integer> product1List = list(1, 2, 3);
        List<Integer> product2List = list(1, 4, 5);
        when(mockRestTemplate.postForEntity(anyString(), any(), any())).thenReturn(mockResponse(product1List, product2List));
        Map<Integer, Set<Order>> result = fetchPricesService.getAllPrices();
        Set<Integer> expectedKeys = new HashSet<>();
        expectedKeys.addAll(product1List);
        expectedKeys.addAll(product2List);
        assertThat(result.keySet()).containsExactlyElementsOf(expectedKeys);
        assertThat(result.get(1)).hasSize(2);
    }

    @Test
    void fetchPricesIgnoresProductsWithPriceOfZero() {
        when(mockRestTemplate.postForEntity(anyString(), any(), any())).thenReturn(mockResponse(list(0, 2)));
        Map<Integer, Set<Order>> result = fetchPricesService.getAllPrices();
        assertThat(result.keySet()).hasSize(1).containsExactly(2);
    }


    @SafeVarargs
    final ResponseEntity<Object> mockResponse(List<Integer>... expectedPrices) {
        GetAllItemsPricesByParamsResponse response = new GetAllItemsPricesByParamsResponse();
        GetAllItemsPricesByParamsResult result = new GetAllItemsPricesByParamsResult();
        for (List<Integer> priceList : expectedPrices) {
            ClsItemsSalePrices item1 = createResultIem(priceList);
            result.getClsItemsSalePrices().add(item1);
        }
        response.setGetAllItemsPricesByParamsResult(result);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    private ClsItemsSalePrices createResultIem(List<Integer> expectedPrices) {
        ClsItemsSalePrices item1 = new ClsItemsSalePrices();
        item1.setBarcode(RandomStringUtils.randomAlphabetic(5));
        item1.setName("Item");
        SalesPrice salesPrice = new SalesPrice();
        List<ClsItemPrices> innerPrices = salesPrice.getClsItemPrices();
        for (Integer price : expectedPrices) {
            ClsItemPrices priceItem = new ClsItemPrices();
            priceItem.setPriceListID(price);
            priceItem.setPrice(price);
            priceItem.setIsIncludeVat("true");
            innerPrices.add(priceItem);
        }

        item1.setSalesPrice(salesPrice);
        return item1;
    }
}
