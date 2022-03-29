package com.megastores.webstore;

import com.webstore.domain.ProductsProvider;
import com.webstore.domain.entity.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DummyProductsAdapter implements ProductsProvider {
    ArrayList<Product> products = new ArrayList<Product>(
            List.of(
                    new Product(1, "product 1:", "short desc", 10.0),
                    new Product(2, "product 2:", "short desc", 20.0),
                    new Product(3, "product 3:", "short desc", 30.0)
            )
    );

    @Override
    public Optional<Product> getProduct(long skuNumber) {
        return products.stream()
                .filter(product -> product.getSkuNumber() == skuNumber)
                .findFirst();
    }
}
