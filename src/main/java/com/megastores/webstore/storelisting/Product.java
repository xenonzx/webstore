package com.megastores.webstore.storelisting;

import lombok.Data;


@Data
public class Product {
    final Long skuNumber;
    final String name;
    final String desc;
    final Double price;

}

