package com.shelach.orders.controllers;

import com.shelach.orders.data.ProductDTO;
import com.shelach.orders.services.ProductsService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.ui.ExtendedModelMap;

import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class OrdersControllerTest {

    private UsernamePasswordAuthenticationToken dummyAuthentication;
    private ProductsService productsService;

    @BeforeEach
    void setup() {
        dummyAuthentication = new UsernamePasswordAuthenticationToken("dummy", "dummy", Collections.emptyList());
        SecurityContextHolder.getContext().setAuthentication(dummyAuthentication);
        productsService = mock(ProductsService.class);
    }

    @Test
    void mainPageReturnsOrdersTemplate() {
        String template = new OrdersController(productsService).mainPage(mock(ExtendedModelMap.class));
        assertThat(template).isEqualTo("orders");
    }

    @Test
    void mainPageStoresUserNameInModel() {
        ExtendedModelMap model = new ExtendedModelMap();
        new OrdersController(productsService).mainPage(model);
        assertThat(model.get("username")).isEqualTo(dummyAuthentication.getName());
    }

    @Test
    void ordersPageReturnsAllAvailableProductsForCustomer() {
        ExtendedModelMap model = new ExtendedModelMap();
        List<ProductDTO> productsList = List.of(
                new ProductDTO("name", 1.0, "barcode", "category1"),
                new ProductDTO("name2", 2.0, "barcode2", "category2")

        );
        when(productsService.getProducts((anyString())))
                .thenReturn(productsList);
        new OrdersController(productsService).mainPage(model);
        assertThat(model.get("products")).isEqualTo(productsList);

    }
}