package com.webstore.domain;

import com.webstore.domain.entity.Cart;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CartServiceImpl implements CartService {
    final Cart cart;

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
