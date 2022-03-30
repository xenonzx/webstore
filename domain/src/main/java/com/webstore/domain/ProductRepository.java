package com.webstore.domain;

import com.webstore.domain.entity.Product;
import lombok.NonNull;
import java.util.List;
import java.util.Optional;

public interface ProductRepository extends DrivenPort {
    Optional<Product> getProduct(long skuNumber);

    @NonNull
    List<Product> getAllProducts();
}
