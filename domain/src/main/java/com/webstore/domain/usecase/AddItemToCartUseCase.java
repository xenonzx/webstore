package com.webstore.domain.usecase;

import com.webstore.domain.adapter.ProductAdapter;
import com.webstore.domain.entity.Cart;
import com.webstore.domain.entity.Product;
import com.webstore.domain.adapter.CartAdapter;
import lombok.AllArgsConstructor;

import java.util.Optional;

@AllArgsConstructor
public class AddItemToCartUseCase {
    final CartAdapter cartAdapter;
    final ProductAdapter productAdapter;

    // decided not to reuse usecases inside one another so that if a case logic change dependant usecases remains un-affected.
    public void invoke(Long id, long skuNumber, int quantity) {
        Optional<Cart> cart = cartAdapter.getCart(id);
        Optional<Product> p = productAdapter.getProduct(skuNumber);
        p.ifPresent(product -> cart.ifPresent(cart1 -> cart1.addLineItem(product, quantity)));
        cartAdapter.saveCart(cart.get());
    }
}
