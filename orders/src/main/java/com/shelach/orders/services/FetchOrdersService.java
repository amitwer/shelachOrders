package com.shelach.orders.services;

import com.shelach.orders.data.Order;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.*;

/**
 * This class is responsible of fetching the initial orders to be
 * presented to the user upon entering the orders page.
 * All quantities are initially set to 0
 */
@Service
@Slf4j
public class FetchOrdersService {
    private final ProductsCache productsCache;
    private final ItemDetailsService itemDetailsService;
    private final FetchPricesService fetchPricesService;

    @Autowired
    public FetchOrdersService(ProductsCache productsCache, ItemDetailsService itemDetailsService, FetchPricesService fetchPricesService) {
        this.productsCache = productsCache;
        this.itemDetailsService = itemDetailsService;
        this.fetchPricesService = fetchPricesService;
    }


    @PostConstruct
    public void initOrders() {
        log.info("Initializing orders cache");
        Map<Integer, Set<Order>> prices = fetchPricesService.getAllPrices();
        List<Order> itemsDetails = itemDetailsService.getAllItemsDetails();
        for (Map.Entry<Integer, Set<Order>> entry : prices.entrySet()) {
            int listId = entry.getKey();
            log.debug("Merging pricelist number <{}>", listId);
            Set<Order> allOrders = entry.getValue();
            allOrders.forEach(order -> order.setCategory(getMatchingOrder(itemsDetails, order).getCategory()));
            productsCache.setProducts("" + listId, allOrders);
        }
        log.info("Done initializing orders cache");

    }

    public List<Order> getProducts(String customerId) {
//        return new ArrayList<>(productsCache.getProducts(customerId));
        return new ArrayList<>(productsCache.getProducts("13"));
    }

    private Order getMatchingOrder(List<Order> itemsDetails, Order price) {
        Optional<Order> matchingDetails = itemsDetails.stream().
                filter(detail -> detail.getBarcode()
                        .equals(price.getBarcode())).findFirst();
        if (matchingDetails.isPresent()) {
            return matchingDetails.get();
        } else {
            log.info("Could not find a match for {}", price);
            return new Order("Unknown", null, null, 0, null);
        }
    }
}
