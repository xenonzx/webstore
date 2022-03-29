package com.webstore.domain.order;

import com.webstore.domain.storelisting.Product;
import lombok.Getter;


 class LineItem {
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