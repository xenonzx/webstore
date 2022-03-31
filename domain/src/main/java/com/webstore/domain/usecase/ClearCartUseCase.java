package com.webstore.domain.usecase;

import com.webstore.domain.adapter.CartAdapter;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ClearCartUseCase {
    final CartAdapter cartAdapter;

    public void invoke(Long id) {
        cartAdapter.getCart(id).get().clear();
    }
}
