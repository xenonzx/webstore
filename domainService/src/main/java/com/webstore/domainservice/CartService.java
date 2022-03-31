package com.webstore.domainservice;

import com.webstore.domain.DrivingPort;
import com.webstore.domain.transfer.CartTransferObject;

// driving port for the cart model
// Domain Service Layer
public interface CartService extends DrivingPort {
    CartTransferObject getCart(Long id);

    void addLineItem(Long id, long skuNumber, int quantity);

    void clearCart(Long id);
}
