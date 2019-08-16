package com.shelach.orders.services;

import com.shelach.orders.data.Order;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class FetchOrdersServiceTest {

    @Test
    void allOrdersAreWithQuantity0() {
        List<Order> orders = new FetchOrdersService().getProducts("dummy");
        orders.forEach(order -> assertThat(order.getQuantity()).describedAs(order.getName()).isEqualTo(0));
    }

}