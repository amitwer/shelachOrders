package com.shelach.orders.services;

import com.shelach.orders.data.Order;
import org.assertj.core.util.Sets;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.web.client.RestTemplate;

import java.util.LinkedHashSet;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

class FetchOrdersServiceTest {
    private FetchOrdersService fetchPricesService;
    private RestTemplate restTemplate;
    private ProductsCache productsCache;

    @BeforeEach
    void setup() {
        productsCache = Mockito.mock(ProductsCache.class);
        fetchPricesService = new FetchOrdersService(productsCache);
    }

    @Test
    void getProductsReturnsProductsFromCache() {
        LinkedHashSet<Order> products = Sets.newLinkedHashSet(new Order("category", "name", "barcode", 0, 1.0));
        when(productsCache.getProducts(anyString())).thenReturn(products);
        List<Order> result = fetchPricesService.getProducts("dummy");
        assertThat(result).containsExactlyInAnyOrder(products.toArray(new Order[0]));
    }

}