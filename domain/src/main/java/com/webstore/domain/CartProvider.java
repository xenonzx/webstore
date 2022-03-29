package com.webstore.domain;

import com.webstore.domain.storelisting.Product;

public interface CartProvider extends DrivenPort {
    Product getProduct(long skuNumber);
}
