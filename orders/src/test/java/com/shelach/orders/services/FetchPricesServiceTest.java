package com.shelach.orders.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

class FetchPricesServiceTest {
    FetchPricesService fetchPricesService;
    RestTemplate mockRestTemplate = Mockito.mock(RestTemplate.class);

    @BeforeEach
    void setUp() {
        fetchPricesService = new FetchPricesService(mockRestTemplate);
    }

    @Test
    void fetchPrices() {
        when(mockRestTemplate.postForEntity(anyString(), any(), any())).thenReturn(mockResponse());

    }

    private ResponseEntity<Object> mockResponse() {
        ResponseEntity<Object> responseEntity = new ResponseEntity<>("MyString", null, HttpStatus.OK);
        return responseEntity;
    }
}