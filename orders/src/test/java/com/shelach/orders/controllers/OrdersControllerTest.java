package com.shelach.orders.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.ui.ExtendedModelMap;

import java.util.Collections;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

class OrdersControllerTest {

    private UsernamePasswordAuthenticationToken dummyAuthentication;

    @BeforeEach
    void setup() {
        dummyAuthentication = new UsernamePasswordAuthenticationToken("dummy", "dummy", Collections.emptyList());
        SecurityContextHolder.getContext().setAuthentication(dummyAuthentication);
    }

    @Test
    void mainPageReturnsOrdersTemplate() {
        String template = new OrdersController().mainPage(mock(ExtendedModelMap.class));
        assertThat(template).isEqualTo("orders");
    }

    @Test
    void mainPageStoresUserNameInModel() {
        ExtendedModelMap model = new ExtendedModelMap();
        new OrdersController().mainPage(model);
        assertThat(model.get("username")).isEqualTo(dummyAuthentication.getName());
    }
}