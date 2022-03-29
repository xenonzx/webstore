package com.webstore.domain;

import com.webstore.domain.entity.Cart;
import com.webstore.domain.transfer.CartMapper;
import com.webstore.domain.transfer.CartTransferObject;

// TODO find a way to inject the cart through constructor injection
public class CartServiceImpl implements CartService {
    final Cart cart = new Cart();
    final ProductsProvider productsProvider;

    public CartServiceImpl(ProductsProvider productsProvider){
        this.productsProvider = productsProvider;
    }

    @Override
    public CartTransferObject getCart() {
        return new CartMapper(cart).map();
    }

    @Override
    public void addLineItem(long skuNumber, int quantity) {
        // TODO validate over skuNumberFormat (not sure if this is the place for validation)
        // TODO handle if product is not found here
        // TODO handel quantity ( should be the responsibility of the cart)
        productsProvider.getProduct(skuNumber).ifPresent(product -> cart.addLineItem(product,quantity));
    }

    @Override
    public void clearCart() {
        cart.clear();
    }
}
