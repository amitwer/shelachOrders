package com.shelach.orders.data;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProductDTO {
    String name;
    Double price;
    String barcode;
}
