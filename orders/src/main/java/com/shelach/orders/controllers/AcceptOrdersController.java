package com.shelach.orders.controllers;

import com.shelach.orders.data.OrderList;
import com.shelach.orders.services.PlaceOrdersService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Slf4j
@Controller
public class AcceptOrdersController {

    private final PlaceOrdersService placeOrderService;

    public AcceptOrdersController(PlaceOrdersService placeOrderService) {
        this.placeOrderService = placeOrderService;
    }

    @SuppressWarnings("SameReturnValue")
    @PostMapping(path = "/order")
    public String acceptOrder(@Valid @ModelAttribute("orders") OrderList orders) {
        log.info("In AcceptOrdersController, got order: <{}>", orders);
        placeOrderService.placeComaxOrder(orders);
        return "orderConfirmed";
    }
}