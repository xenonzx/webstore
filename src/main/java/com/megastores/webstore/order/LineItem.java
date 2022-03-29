package com.megastores.webstore.order;

import com.megastores.webstore.storelisting.Product;
import lombok.Getter;


public class LineItem {
    @Getter
    private final long productId;
    private final double unitPrice;
    private int quantity;

    public LineItem(Product product, Integer quantity) {
        this.productId = product.getSkuNumber();
        this.unitPrice = product.getPrice();
        this.quantity = quantity;
    }

    public void addQuantity(int quantity) {
        this.quantity += quantity;
    }
}