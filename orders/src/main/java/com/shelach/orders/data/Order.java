package com.shelach.orders.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    String category;
    private String name;
    private String barcode;
    private int quantity;
    private Double price;
}
