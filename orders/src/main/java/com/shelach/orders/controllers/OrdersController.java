package com.shelach.orders.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OrdersController {
    @RequestMapping("")
    public String login() {
        return "orders";
    }
}
