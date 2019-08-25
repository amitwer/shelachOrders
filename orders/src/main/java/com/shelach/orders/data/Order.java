package com.shelach.orders.data;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Order {
    private String name;
    private String barcode;
    private String category;
    private int quantity;
    private Double price;

    public Order(String category, String name, String barcode, int quantity, Double price) {
        this.name = name;
        this.barcode = barcode;
        this.category = category;
        this.quantity = quantity;
        this.price = price;
    }
}
