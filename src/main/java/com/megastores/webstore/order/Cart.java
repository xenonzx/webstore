package com.megastores.webstore.order;

import com.megastores.webstore.storelisting.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;

@AllArgsConstructor
public class Cart {
    @Getter
    private final ArrayList<LineItem> items;
    void addLineItem(Product product, int quantity) {
        items.stream().forEach(lineItem -> {
            if (lineItem.getProductId() == product.getSkuNumber()) {
                lineItem.addQuantity(quantity);
            }
        });
    }
}
