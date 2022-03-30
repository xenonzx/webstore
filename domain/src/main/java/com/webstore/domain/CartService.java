package com.webstore.domain;

import com.webstore.domain.transfer.CartTransferObject;

// driving port for the cart model
// Domain Service Layer
public interface CartService extends DrivingPort {
    CartTransferObject getCart(int id);

    void addLineItem(int id, long skuNumber, int quantity);

    void clearCart(int id);
}
