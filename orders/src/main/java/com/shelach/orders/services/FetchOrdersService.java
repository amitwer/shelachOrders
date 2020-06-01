package com.shelach.orders.services;

import com.shelach.orders.data.Order;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is responsible of fetching the initial orders to be
 * presented to the user upon entering the orders page.
 * All quantities are initially set to 0
 */
@Service
@Slf4j
public class FetchOrdersService {
    private final ProductsCache productsCache;

    @Autowired
    public FetchOrdersService(ProductsCache productsCache) {
        this.productsCache = productsCache;
    }

    public List<Order> getProducts(String customerId) {
        return new ArrayList<>(productsCache.getProducts(customerId));
    }
}
