package com.webstore.domain;

import com.webstore.domain.storelisting.Product;

public interface ProductsRepository extends DrivenPort {
    Product getProduct(long skuNumber);
}
