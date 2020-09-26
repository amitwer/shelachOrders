package com.shelach.orders.services;

import com.shelach.orders.comax.generated.itemdetails.ArrayOfItemDetails;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import org.springframework.http.HttpEntity;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

class ItemDetailsServiceTest {


    private RestTemplate restTemplate;
    private ComaxCredentialsProvider credentialsProvider;
    private ItemDetailsService itemDetailsService;

    @BeforeEach
    private void setup() {
        restTemplate = mock(RestTemplate.class);
        credentialsProvider = new ComaxCredentialsProvider("username", "password");
        itemDetailsService = new ItemDetailsService(restTemplate, credentialsProvider, "https://dummy");
    }
//
//    @Test
//    void getAllItemsDetailsConvertsResponseCorrectly() {
//        when(restTemplate.postForObject(anyString(), any(), any())).thenReturn(new ArrayOfItemDetails());
//        List<Order> allItemsDetails = itemDetailsService.getAllItemsDetails();
////        TODO Complete this test
//
//    }

    @Test
    void getAllItemsDetailsUsesCorrectParams() {
        when(restTemplate.postForObject(anyString(), any(), any())).thenReturn(new ArrayOfItemDetails());
        itemDetailsService.getAllItemsDetails();
        @SuppressWarnings("unchecked")
        ArgumentCaptor<HttpEntity<MultiValueMap<String, String>>> captor = ArgumentCaptor.forClass(HttpEntity.class);
        Mockito.verify(restTemplate, times(1)).postForObject(anyString(), captor.capture(), eq(ArrayOfItemDetails.class));
        HttpEntity<MultiValueMap<String, String>> value = captor.getValue();
        MultiValueMap<String, String> expectedParams = createExpectedRequestParameters();
        assertThat(value.getBody()).isEqualTo(expectedParams);
        assertThat(value.getHeaders().getContentType()).isEqualTo(MediaType.APPLICATION_FORM_URLENCODED);
    }

    private MultiValueMap<String, String> createExpectedRequestParameters() {
        MultiValueMap<String, String> expectedParams = new LinkedMultiValueMap<>();
        expectedParams.add("LoginID", credentialsProvider.getUsername());
        expectedParams.add("LoginPassword", credentialsProvider.getLoginPassword());
        expectedParams.add("ItemID", "");
        expectedParams.add("DepartmentID", "");
        expectedParams.add("GroupID", "");
        expectedParams.add("Sub_GroupID", "");
        expectedParams.add("ItemModelID", "");
        expectedParams.add("ItemColorID", "");
        expectedParams.add("ItemSizeID", "");
        expectedParams.add("StoreID", "");
        expectedParams.add("PriceListID", "");
        expectedParams.add("StoreIDForOpenOrdersOffset", "");
        expectedParams.add("SupplierID", "");
        expectedParams.add("CustomerID", "");
        expectedParams.add("LastUpdatedFromDate", "");
        expectedParams.add("NotIncludeSuppliersOrdersInQuantity", "");

        return expectedParams;
    }
}
