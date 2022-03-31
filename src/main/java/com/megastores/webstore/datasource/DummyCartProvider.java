package com.megastores.webstore.datasource;

import com.webstore.domain.adapter.CartAdapter;
import com.webstore.domain.entity.Cart;

import java.util.ArrayList;
import java.util.Optional;

public class DummyCartProvider implements CartAdapter {
    private final Cart cart1 = new Cart(1L, new ArrayList<>());
    private final Cart cart2 = new Cart(2L, new ArrayList<>());

    @Override
    public Optional<Cart> getCart(Long id) {
        if (id == 1L) {
            return Optional.of(cart1);
        } else if (id == 2L) {
            return Optional.of(cart2);
        }
        return Optional.empty();
    }

    @Override
    public void saveCart(Cart cart) {
        // TODO
    }
}
