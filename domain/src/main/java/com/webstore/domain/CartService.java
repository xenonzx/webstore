package com.webstore.domain;

import com.webstore.domain.transfer.CartTransferObject;

// driving port for the cart model
// Domain Service Layer
public interface CartService extends DrivingPort {
    CartTransferObject getCart();

    void addLineItem(long skuNumber, int quantity);

    void clearCart();
}
