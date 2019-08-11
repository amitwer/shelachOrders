package com.shelach.orders.controllers;

import com.shelach.orders.services.ProductsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
class OrdersController {
    private final ProductsService productsService;

    @Autowired
    public OrdersController(ProductsService productsService) {
        this.productsService = productsService;
    }

    @SuppressWarnings("SameReturnValue")
    @RequestMapping("")
    public String mainPage(ExtendedModelMap model) {
        log.info("Building orders page");
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String username = authentication.getName();
        model.put("username", username);
        model.put("products", productsService.getProducts(username));
        log.info("Orders page ready for user <{}>", username);
        return "orders";
    }
}
