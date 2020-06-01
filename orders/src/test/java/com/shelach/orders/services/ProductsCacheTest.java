package com.shelach.orders.services;

import com.shelach.orders.data.Order;
import org.assertj.core.util.Sets;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedHashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

class ProductsCacheTest {

    private ProductsCache cache;

    @BeforeEach
    private void setup() {
        cache = new ProductsCache();
    }

    @Test
    void customerNotFoundReturnsEmptySet() {
        Set<Order> result = cache.getProducts("not a customer");
        assertThat(result).isEmpty();
    }

    @Test
    void customerFoundReturnsResult() {
        LinkedHashSet<Order> expectedResult = Sets.newLinkedHashSet(new Order("category", "name", "barcode", 0, 0.0));
        String priceListId = "id1";
        cache.setProducts(priceListId, expectedResult);
        Set<Order> result = cache.getProducts(priceListId);
        assertThat(result).isEqualTo(expectedResult);
    }


}