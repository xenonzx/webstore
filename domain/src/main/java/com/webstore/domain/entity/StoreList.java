package com.webstore.domain.entity;

import com.webstore.domain.ProductsProvider;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

// Store list is the root entity
// responsible for the visibility of items on store
// can make item available or unavailable  on store this is a todo
// can change product price if user is store listing admin this is a todo
@AllArgsConstructor
class StoreList {
    final ProductsProvider productsProvider;

    List<Product> listAllInStockProducts() {
        return productsProvider
                .getAllProducts()
                .stream()
                .filter(product -> product.availableQuantity>0)
                .collect(Collectors.toList());

    }
}
