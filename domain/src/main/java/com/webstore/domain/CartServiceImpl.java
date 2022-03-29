package com.webstore.domain;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CartServiceImpl implements CartService {
   final ProductsRepository productsRepository;

    @Override
    public void addLineItem(long skuNumber, int quantity) {

    }

    @Override
    public void clear() {

    }

}
