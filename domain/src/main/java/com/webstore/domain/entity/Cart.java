package com.webstore.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NonNull;

import java.util.ArrayList;

//cart is aggregate root entity according to current understanding
@AllArgsConstructor
@Data
public class Cart {
    final Long id;
    @Getter
    @NonNull
    private ArrayList<LineItem> items = new ArrayList<>();

    public void addLineItem(Product product, int quantity) {
        items.stream()
                .filter(lineItem -> lineItem.getProduct().getSkuNumber() == product.getSkuNumber())
                .findFirst()
                .ifPresentOrElse(lineItem -> lineItem.addQuantity(quantity), () -> items.add(new LineItem(null, product, quantity)));

    }

    public void clear() {
        items.clear();
    }
    // TODO delete later
}
