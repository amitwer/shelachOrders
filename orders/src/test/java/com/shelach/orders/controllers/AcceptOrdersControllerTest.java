package com.shelach.orders.controllers;

import com.shelach.orders.data.Order;
import com.shelach.orders.data.OrderList;
import com.shelach.orders.services.PlaceOrdersService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.internal.verification.VerificationModeFactory.times;

class AcceptOrdersControllerTest {

    @Test
    void acceptOrdersReturnsOkPage() {
        AcceptOrdersController acceptOrdersController = new AcceptOrdersController(mock(PlaceOrdersService.class));
        String template = acceptOrdersController.acceptOrder(null);
        Assertions.assertThat(template).isEqualTo("orderConfirmed");
    }

    @Test
    void acceptOrdersSendsOrderToComaxService() {
        PlaceOrdersService placeOrderService = mock(PlaceOrdersService.class);
        AcceptOrdersController acceptOrdersController = new AcceptOrdersController(placeOrderService);
        OrderList orders = new OrderList(new Order("category", "name", "barcode", 12, 0.5));
        acceptOrdersController.acceptOrder(orders);
        verify(placeOrderService, times(1)).placeComaxOrder(eq(orders));

    }

}