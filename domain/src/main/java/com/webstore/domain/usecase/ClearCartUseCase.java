package com.webstore.domain.usecase;

import com.webstore.domain.repo.CartRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ClearCartUseCase {
    final CartRepository cartRepository;

    public void invoke(int id) {
        cartRepository.getCart(id).get().clear();
    }
}
