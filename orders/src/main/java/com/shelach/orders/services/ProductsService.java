package com.shelach.orders.services;

import com.shelach.orders.data.ProductDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ProductsService {
    public List<ProductDTO> getProducts(String customerName) {
        log.info("Fetching products for customer {}", customerName);
        return List.of(
                new ProductDTO("עגבניות", 3.3, "TOMATOES", "ירקות"),
                new ProductDTO("מלפפונים", 377.3, "Cucumbers", "קפואים")
        );
    }
}
