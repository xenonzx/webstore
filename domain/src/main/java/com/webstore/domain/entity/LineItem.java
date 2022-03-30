package com.webstore.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class LineItem {
    private final Product product;
    private int quantity;

    public void addQuantity(int quantity) {
        this.quantity += quantity;
    }

    public double getTotalPrice() {
        return product.getPrice() * quantity;
    }
}