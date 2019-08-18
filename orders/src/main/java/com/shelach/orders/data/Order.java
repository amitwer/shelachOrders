package com.shelach.orders.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private String name;
    private String barcode;
    private String category;
    private int quantity;
    private Double price;
}
