package com.webstore.domain.usecase;

import com.webstore.domain.adapter.CartAdapter;
import com.webstore.domain.transfer.CartMapper;
import com.webstore.domain.transfer.CartTransferObject;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class LoadMappedCartUseCase {
    final CartAdapter cartAdapter;

    // cart id or user id depend on the requirement
    public CartTransferObject invoke(Long id) {
        return new CartMapper(cartAdapter.getCart(id).get()).map();
    }
}
