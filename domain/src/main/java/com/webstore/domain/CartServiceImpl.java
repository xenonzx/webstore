package com.webstore.domain;

import com.webstore.domain.entity.Cart;
import com.webstore.domain.transfer.CartMapper;
import com.webstore.domain.transfer.CartTransferObject;

// TODO find a way to inject the cart through constructor injection
public class CartServiceImpl implements CartService {
    final Cart cart = new Cart();

    @Override
    public CartTransferObject getCart() {
        return new CartMapper(cart).map();
    }

    @Override
    public void addLineItem(long skuNumber, int quantity) {

    }

    @Override
    public void clearCart() {
        cart.clear();
    }
}
