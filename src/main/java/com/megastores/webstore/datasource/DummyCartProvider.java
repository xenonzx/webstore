package com.megastores.webstore.datasource;

import com.webstore.domain.entity.Cart;
import com.webstore.domain.repo.CartRepository;

import java.util.Optional;

public class DummyCartProvider implements CartRepository {
    private final Cart cart1 = new Cart();
    private final Cart cart2 = new Cart();

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
