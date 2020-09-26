package com.shelach.orders.controllers;

import com.shelach.orders.data.Order;
import com.shelach.orders.data.OrderList;
import com.shelach.orders.services.PlaceOrdersService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.csrf;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

@Slf4j
@ExtendWith({SpringExtension.class})
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@AutoConfigureMockMvc
@TestPropertySource(properties = {"comax.username=login", "comax.password=dummyPass"})
@ActiveProfiles("test")
class AcceptOrdersControllerClientSideTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private PlaceOrdersService placeOrdersService;

    @Test
    @WithMockUser
    void acceptOrdersReturnsOk() throws Exception {
        OrderList orderList = new OrderList(new Order("category", "name", "barcode", 10, 12.4));
        MvcResult result = mvc.perform(post("/order").with(csrf()).flashAttr("orders", orderList)).andReturn();
        assertThat(result.getResponse().getStatus()).isEqualTo(HttpStatus.OK.value());
        verify(placeOrdersService, times(1)).placeComaxOrder(eq(orderList));
    }


    @Test
    @WithMockUser
    void acceptOrdersCallsComaxWithCorrectParam() throws Exception {
        OrderList orderList = new OrderList(new Order("category", "name", "barcode", 10, 12.4));
        mvc.perform(post("/order").with(csrf()).flashAttr("orders", orderList)).andReturn();
        verify(placeOrdersService, times(1)).placeComaxOrder(eq(orderList));
    }
}