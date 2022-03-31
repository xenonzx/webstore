package com.webstore.domain.adapter;

import com.webstore.domain.DrivenPort;
import com.webstore.domain.entity.Product;
import lombok.NonNull;
import java.util.List;
import java.util.Optional;

public interface ProductAdapter extends DrivenPort {
    Optional<Product> getProduct(long skuNumber);

    @NonNull
    List<Product> getAllProducts();
}
