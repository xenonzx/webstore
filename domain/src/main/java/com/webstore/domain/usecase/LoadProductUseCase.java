package com.webstore.domain.usecase;

import com.webstore.domain.adapter.ProductAdapter;
import com.webstore.domain.entity.Product;
import lombok.AllArgsConstructor;

import java.util.Optional;

@AllArgsConstructor
public class LoadProductUseCase {
    final ProductAdapter productAdapter;
    public Optional<Product> invoke(long skuNumber){
        return productAdapter.getProduct(skuNumber);
    }
}
