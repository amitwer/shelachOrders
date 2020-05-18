package com.shelach.orders.controllers;

import com.shelach.orders.services.FetchOrdersService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
class OrdersController {
    private final FetchOrdersService fetchOrdersService;

    @Autowired
    public OrdersController(FetchOrdersService fetchOrdersService) {
        this.fetchOrdersService = fetchOrdersService;
    }

    @SuppressWarnings("SameReturnValue")
    @GetMapping("")
    public String mainPage(ExtendedModelMap model) {
        log.info("Building orders page");
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String username = authentication.getName();
        model.put("username", username);
        //TODO: uncomment
//        List<Order> orders = fetchOrdersService.getProducts(username);
        log.info("Orders page ready for user <{}>", username);
//        OrderList orderList = new OrderList(orders);

//        model.addAttribute("orders", orderList);
        return "orders";
    }
}
