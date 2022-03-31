package com.webstore.domain.adapter;

import com.webstore.domain.entity.Cart;

import java.util.Optional;

public interface CartAdapter {
    Optional<Cart> getCart(Long id);
    void saveCart(Cart cart);
}
