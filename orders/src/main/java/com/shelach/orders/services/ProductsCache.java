package com.shelach.orders.services;

import com.shelach.orders.data.Order;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Service
public class ProductsCache {
    private final Map<String, Set<Order>> products;

    public ProductsCache() {
        this.products = new HashMap<>();
    }

    public Set<Order> getProducts(String anyString) {
        return products.getOrDefault(anyString, Collections.emptySet());
    }

    public void setProducts(String priceListId, Set<Order> products) {
        this.products.put(priceListId, products);

    }
}
