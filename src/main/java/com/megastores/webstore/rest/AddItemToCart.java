package com.megastores.webstore.rest;

import lombok.Data;

@Data
public class AddItemToCart {
    final long skuNumber;
    final int quantity;

}
