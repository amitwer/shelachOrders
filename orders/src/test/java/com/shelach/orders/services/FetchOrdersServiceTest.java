package com.shelach.orders.services;

import com.shelach.orders.data.Order;
import org.assertj.core.util.Lists;
import org.assertj.core.util.Sets;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;

import javax.annotation.PostConstruct;
import java.lang.reflect.Method;
import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;
import static org.mockito.Mockito.*;

class FetchOrdersServiceTest {
    private FetchOrdersService fetchOrdersService;
    private ProductsCache productsCache;
    private FetchPricesService fetchPricesService;
    private ItemDetailsService itemDetailsService;

    @BeforeEach
    void setup() {
        productsCache = Mockito.mock(ProductsCache.class);
        fetchPricesService = Mockito.mock(FetchPricesService.class);
        itemDetailsService = Mockito.mock(ItemDetailsService.class);
        fetchOrdersService = new FetchOrdersService(productsCache, itemDetailsService, fetchPricesService);
    }


    @Test
    void fetchOrdersInitializesCacheUponStartup() {
        Set<Order> pricesContent = Sets.newLinkedHashSet(
                order("category1", "barcode1", 12.0),
                order("category2", "barcode2", 13.0),
                order("category3", "barcode3", 13.0)
        );

        Map<Integer, Set<Order>> prices = new HashMap<>();
        prices.put(1, pricesContent);
        when(fetchPricesService.getAllPrices()).thenReturn(prices);
        List<Order> itemDetails = Lists.newArrayList(
                order("category1", "barcode1", null),
                order("category2", "barcode2", null),
                order("category3", "barcode3", null)
        );
        when(itemDetailsService.getAllItemsDetails()).thenReturn(itemDetails);
        fetchOrdersService.initOrders();
        LinkedList<Order> expectedResults = new LinkedList<>(pricesContent);
        expectedResults.get(0).setCategory("category1");
        expectedResults.get(1).setCategory("category2");
        expectedResults.get(2).setCategory("category3");


        @SuppressWarnings("unchecked") ArgumentCaptor<Set<Order>> captor = ArgumentCaptor.forClass(Set.class);
        verify(productsCache, times(1)).setProducts(eq("1"), captor.capture());
        assertThat(captor.getValue()).containsExactlyElementsOf(expectedResults);

    }

    private Order order(String category_num, String barcode, Double price) {
        return new Order(category_num, "name", barcode, 0, price);
    }

    @Test
    void fetchOrdersServiceHasPostConstructMethodNamedInitOrders() {
        try {
            Method initOrders = FetchOrdersService.class.getMethod("initOrders");
            assertThat(initOrders.getAnnotation(PostConstruct.class)).isNotNull();
        } catch (NoSuchMethodException e) {
            fail("Expected a method named initOrders to exist", e);
        }
    }

    @Test
    void getProductsReturnsProductsFromCache() {
        LinkedHashSet<Order> products = Sets.newLinkedHashSet(new Order("category", "name", "barcode", 0, 1.0));
        when(productsCache.getProducts(anyString())).thenReturn(products);
        List<Order> result = fetchOrdersService.getProducts("dummy");
        assertThat(result).containsExactlyInAnyOrder(products.toArray(new Order[0]));
    }

}