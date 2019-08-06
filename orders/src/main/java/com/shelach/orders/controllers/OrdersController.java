package com.shelach.orders.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OrdersController {
    @SuppressWarnings("SameReturnValue")
    @RequestMapping("")
    public String mainPage(ExtendedModelMap model) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        model.put("username", authentication.getName());
        return "orders";
    }
}
