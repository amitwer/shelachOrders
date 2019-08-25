package com.shelach.orders.services;

import com.shelach.orders.data.Order;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

class FetchOrdersServiceTest {

    @Test
    void fetchOrdersCallsComax() {
        ComaxItemsService comaxItemsService = mock(ComaxItemsService.class);
        List<Order> expectedOrders = Lists.list(new Order("category","name", "barcode", 0, 7.9));
        when(comaxItemsService.getAllProducts()).thenReturn(expectedOrders);
        List<Order> orders = new FetchOrdersService(comaxItemsService).getProducts("dummy");
        assertThat(orders).isEqualTo(expectedOrders);
        verify(comaxItemsService, times(1)).getAllProducts();
    }


}