package com.webstore.domain;

import com.webstore.domain.entity.Product;

public interface CartProvider extends DrivenPort {
    Product getProduct(long skuNumber);
}
