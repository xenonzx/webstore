package com.megastores.webstore.rest;

import lombok.Data;

import java.util.ArrayList;

@Data
public class AddToCartRequestBody {
    final ArrayList<AddItemToCart> list;

    @Data
    static public class AddItemToCart {
        final long skuNumber;
        final int quantity;

    }
}
