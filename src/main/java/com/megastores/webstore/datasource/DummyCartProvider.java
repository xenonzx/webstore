package com.megastores.webstore.datasource;

import com.webstore.domain.entity.Cart;
import com.webstore.domain.repo.CartRepository;

import java.util.Optional;

public class DummyCartProvider implements CartRepository {
    private final Cart cart1 = new Cart();
    private final Cart cart2 = new Cart();

    @Override
    public Optional<Cart> getCart(int id) {
        switch (id) {
            case 1:
                return Optional.of(cart1);
            case 2:
                return Optional.of(cart2);

        }
        return Optional.empty();
    }
}
