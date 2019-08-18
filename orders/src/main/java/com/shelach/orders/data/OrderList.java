package com.shelach.orders.data;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

@Data
@NoArgsConstructor
public class OrderList {
    List<Order> orders = new LinkedList<>();

    public OrderList(Collection<Order> orders) {
        this.orders = List.copyOf(orders);
    }

    public OrderList(Order... orders) {
        this.orders = List.of(orders);
    }
}
