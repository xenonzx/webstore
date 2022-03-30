package com.webstore.domain.usecase;

import com.webstore.domain.repo.CartRepository;
import com.webstore.domain.transfer.CartMapper;
import com.webstore.domain.transfer.CartTransferObject;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class LoadMappedCartUseCase {
    final CartRepository cartRepository;

    // cart id or user id depend on the requirement
    public CartTransferObject invoke(int id) {
        return new CartMapper(cartRepository.getCart(id).get()).map();
    }
}
