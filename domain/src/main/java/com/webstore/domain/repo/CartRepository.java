package com.webstore.domain.repo;

import com.webstore.domain.entity.Cart;

import java.util.Optional;

public interface CartRepository {
    Optional<Cart> getCart(Long id);
    void saveCart(Cart cart);
}
