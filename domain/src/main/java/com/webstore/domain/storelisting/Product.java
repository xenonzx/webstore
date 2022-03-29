package com.webstore.domain.storelisting;

import lombok.Data;


@Data
public class Product {
    final long skuNumber;
    final String name;
    final String desc;
    final Double price;
}

