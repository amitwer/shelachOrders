package com.shelach.orders.controllers;

import com.shelach.orders.data.Order;
import com.shelach.orders.data.OrderList;
import com.shelach.orders.services.FetchOrdersService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.ui.ExtendedModelMap;

import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.util.Lists.list;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class OrdersControllerTest {

    private UsernamePasswordAuthenticationToken dummyAuthentication;
    private FetchOrdersService fetchOrdersService;

    @BeforeEach
    void setup() {
        dummyAuthentication = new UsernamePasswordAuthenticationToken("dummy", "dummy", Collections.emptyList());
        SecurityContextHolder.getContext().setAuthentication(dummyAuthentication);
        fetchOrdersService = mock(FetchOrdersService.class);
    }

    @Test
    void mainPageReturnsOrdersTemplate() {
        String template = new OrdersController(fetchOrdersService).mainPage(mock(ExtendedModelMap.class));
        assertThat(template).isEqualTo("orders");
    }

    @Test
    void mainPageStoresUserNameInModel() {
        ExtendedModelMap model = new ExtendedModelMap();
        new OrdersController(fetchOrdersService).mainPage(model);
        assertThat(model.get("username")).isEqualTo(dummyAuthentication.getName());
    }

    @Test
    void ordersPageReturnsAllAvailableProductsForCustomer() {
        ExtendedModelMap model = new ExtendedModelMap();
        List<Order> productsList = list(
                new Order("name", "barcode", "category", 1, 12.0),
                new Order("name2", "barcode2", "category2", 8, 6.2)

        );
        when(fetchOrdersService.getProducts((anyString())))
                .thenReturn(productsList);
        new OrdersController(fetchOrdersService).mainPage(model);
        assertThat(model.get("orders")).isEqualTo(new OrderList(productsList));

    }
}