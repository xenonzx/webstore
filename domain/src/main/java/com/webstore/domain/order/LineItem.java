package com.webstore.domain.order;

import com.webstore.domain.storelisting.Product;
import lombok.Getter;

@Getter
public class LineItem {
    private final Product product;
    private int quantity;

    public LineItem(Product product, Integer quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public void addQuantity(int quantity) {
        this.quantity += quantity;
    }

    public double getTotalPrice() {
        return product.getPrice() * quantity;
    }
}