package com.megastores.webstore.adapter;

import com.megastores.webstore.converter.CartConverter;
import com.megastores.webstore.dataEntities.CartDataEntity;
import com.megastores.webstore.repo.CartRepository;
import com.webstore.domain.adapter.CartAdapter;
import com.webstore.domain.entity.Cart;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@AllArgsConstructor
public class CartAdapterImpl implements CartAdapter {
    final CartRepository cartRepository;
    final CartConverter cartConverter;

    @Override
    public Optional<Cart> getCart(Long id) {
        Optional<CartDataEntity> cart = cartRepository.findById(id);
        cartConverter.toDomainModel(cart.get());
        return Optional.of(cartConverter.toDomainModel(cart.get()));
    }

    @Override
    public void saveCart(Cart cart) {
        cartRepository.save(cartConverter.toDataModel(cart));
    }
}
