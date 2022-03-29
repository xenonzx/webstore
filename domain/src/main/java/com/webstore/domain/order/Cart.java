package com.webstore.domain.order;

import com.webstore.domain.storelisting.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.ArrayList;

@AllArgsConstructor
@NoArgsConstructor
public class Cart {
    @Getter
    @NonNull
    private ArrayList<LineItem> items = new ArrayList<>();

    void addLineItem(Product product, int quantity) {
        items.forEach(lineItem -> {
            if (lineItem.getProductId() == product.getSkuNumber()) {
                lineItem.addQuantity(quantity);
            }
        });
    }
}
