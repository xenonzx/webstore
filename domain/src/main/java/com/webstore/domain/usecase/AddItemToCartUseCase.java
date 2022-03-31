package com.webstore.domain.usecase;

import com.webstore.domain.ProductRepository;
import com.webstore.domain.entity.Cart;
import com.webstore.domain.entity.Product;
import com.webstore.domain.repo.CartRepository;
import lombok.AllArgsConstructor;

import java.util.Optional;

@AllArgsConstructor
public class AddItemToCartUseCase {
    final CartRepository cartRepository;
    final ProductRepository productRepository;

    // decided not to reuse usecases inside one another so that if a case logic change dependant usecases remains un-affected.
    public void invoke(int id, long skuNumber, int quantity) {
        Optional<Cart> cart = cartRepository.getCart(id);
        Optional<Product> p = productRepository.getProduct(skuNumber);
        p.ifPresent(product -> cart.ifPresent(cart1 -> cart1.addLineItem(product, quantity)));
        cartRepository.saveCart(cart.get());
    }
}
