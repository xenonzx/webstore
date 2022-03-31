package com.megastores.webstore.datasource;

import com.webstore.domain.adapter.ProductAdapter;
import com.webstore.domain.entity.Product;
import lombok.NonNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DummyProductsAdapter implements ProductAdapter {
    @NonNull
    ArrayList<Product> products = new ArrayList<Product>(
            List.of(
                    new Product(1, "product 1:", "short desc", 10.0, 10, "2020"),
                    new Product(2, "product 2:", "short desc", 20.0, 10, "2021"),
                    new Product(3, "product 3:", "short desc", 30.0, 10, "2022"),
                    new Product(4, "rare product :", "short desc", 5.0, 2, "2020"),
                    new Product(5, "coming soon product", "short desc", 30.0, 0, "2023")
            )
    );

    @Override
    public Optional<Product> getProduct(long skuNumber) {
        return products.stream()
                .filter(product -> product.getSkuNumber() == skuNumber)
                .findFirst();
    }

    @Override
    public ArrayList<Product> getAllProducts() {
        return products;
    }
}
