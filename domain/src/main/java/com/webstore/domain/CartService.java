package com.webstore.domain;

// driving port for the cart model
public interface CartService extends DrivingPort {
    void addLineItem(long skuNumber, int quantity);
    void clear();
}
