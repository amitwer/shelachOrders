package com.shelach.orders.data;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;

@Data
@NoArgsConstructor
public class OrderList {
    List<Order> orders = new LinkedList<>();

    public OrderList(Collection<Order> orders) {
        this.orders = new ArrayList<>(orders);
    }

    public OrderList(Order... orders) {
        this.orders = Arrays.asList(orders);
    }
}
