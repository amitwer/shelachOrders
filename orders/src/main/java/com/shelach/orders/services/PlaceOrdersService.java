package com.shelach.orders.services;

import com.shelach.orders.data.OrderList;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PlaceOrdersService {

    public void placeComaxOrder(OrderList orders) {
        log.info("Placing orders <{}>", orders);
    }
}
