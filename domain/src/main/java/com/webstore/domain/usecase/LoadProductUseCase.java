package com.webstore.domain.usecase;

import com.webstore.domain.ProductRepository;
import com.webstore.domain.entity.Product;
import lombok.AllArgsConstructor;

import java.util.Optional;

@AllArgsConstructor
public class LoadProductUseCase {
    final ProductRepository productRepository;
    public Optional<Product> invoke(long skuNumber){
        return productRepository.getProduct(skuNumber);
    }
}
