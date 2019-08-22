package com.shelach.orders.services;

import com.shelach.orders.comax.generated.items.ArrayOfClsItemsType;
import com.shelach.orders.comax.generated.items.ClsItemsType;
import com.shelach.orders.data.Order;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

class ComaxItemsServiceTest {

    private static final String DUMMY_URL = "http://dummyUrl.com/dummy";
    private ComaxCredentialsProvider comaxCredentialsProvider;
    @Mock
    private RestTemplate restTemplateMock;
    private ComaxItemsService comaxItemsService;
    @Captor
    private ArgumentCaptor<String> paramsCaptor;
    @Mock
    private ResponseEntity<ArrayOfClsItemsType> mockRestResponse;

    @BeforeEach
    void setup() {
        MockitoAnnotations.initMocks(this);
        comaxCredentialsProvider = new ComaxCredentialsProvider("login", "password");
//        when(restTemplateMock.getForEntity(any(), eq(ArrayOfClsItemsType.class))).thenReturn(mockRestResponse);
        when(restTemplateMock.getForEntity(anyString(), eq(ArrayOfClsItemsType.class))).thenReturn(mockRestResponse);
        this.comaxItemsService = new ComaxItemsService(restTemplateMock, comaxCredentialsProvider, DUMMY_URL);
    }

    @Test
    void itemsServiceCallsCorrectEndpoint() {
        comaxItemsService.getAllProducts();
        verify(restTemplateMock, times(1)).getForEntity(paramsCaptor.capture(), eq(ArrayOfClsItemsType.class));
        String fullUrl = paramsCaptor.getValue();
        String urlWithoutQueryString = fullUrl.substring(0, fullUrl.indexOf('?'));
        assertThat(urlWithoutQueryString).isEqualTo(DUMMY_URL + "GetAllItemsDetails");
    }

    @Test
    void itemsServiceUsesCorrectPassword() {
        comaxItemsService.getAllProducts();
        verify(restTemplateMock, times(1)).getForEntity(paramsCaptor.capture(), any());
        UriComponents components = UriComponentsBuilder.fromUriString(paramsCaptor.getValue()).build();
        MultiValueMap<String, String> queryParams = components.getQueryParams();
        assertThat(queryParams.toSingleValueMap()).containsAllEntriesOf(Map.of("LoginID", comaxCredentialsProvider.getUsername(),
                "LoginPassword", comaxCredentialsProvider.getLoginPassword()));
    }

    @Test
    void itemsServiceUsesCorrectStoreId() {
        comaxItemsService.getAllProducts();
        verify(restTemplateMock, times(1)).getForEntity(paramsCaptor.capture(), any());
        UriComponents components = UriComponentsBuilder.fromUriString(paramsCaptor.getValue()).build();
        MultiValueMap<String, String> queryParams = components.getQueryParams();
        assertThat(queryParams.toSingleValueMap()).containsAllEntriesOf(Map.of("StoreID", "1"));
    }

    @Test
    void itemsServiceTranslatesComaxResponseToOrder() {
        ArrayOfClsItemsType arrayOfClsItemsType = new ArrayOfClsItemsType();
        arrayOfClsItemsType.getClsItems().add(new ClsItemsType(11, "name", 7.2));
        when(mockRestResponse.getBody()).thenReturn(arrayOfClsItemsType);
        List<Order> allProducts = comaxItemsService.getAllProducts();
        assertThat(allProducts).hasSize(arrayOfClsItemsType.getClsItems().size());
        for (int i = 0; i < allProducts.size(); i++) {
            ClsItemsType item = arrayOfClsItemsType.getClsItems().get(i);
            Order order = allProducts.get(i);
            assertThat(order).hasFieldOrPropertyWithValue("barcode", "" + item.getBarcode())
                    .hasFieldOrPropertyWithValue("name", item.getName())
                    .hasFieldOrPropertyWithValue("price", item.getSupplierPrice().doubleValue());
        }
    }
}