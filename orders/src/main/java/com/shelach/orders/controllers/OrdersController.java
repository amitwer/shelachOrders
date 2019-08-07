package com.shelach.orders.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
public class OrdersController {
    @SuppressWarnings("SameReturnValue")
    @RequestMapping("")
    public String mainPage(ExtendedModelMap model) {
        log.info("Building orders page");
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String username = authentication.getName();
        model.put("username", username);
        log.info("Orders page ready for user <{}>", username);
        return "orders";
    }
}
