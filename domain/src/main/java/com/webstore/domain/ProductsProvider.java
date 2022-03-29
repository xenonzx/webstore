package com.webstore.domain;

import com.webstore.domain.entity.Product;

import java.util.Optional;

public interface ProductsProvider extends DrivenPort {
    Optional<Product> getProduct(long skuNumber);
}
