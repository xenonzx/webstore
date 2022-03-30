package com.webstore.domain.transfer;

import com.webstore.domain.entity.Product;

public class ProductMapper extends TransferObjectMapper<Product, ProductTransferObject> {
    public ProductMapper(Product obj) {
        super(obj);
    }

    @Override
    ProductTransferObject map() {
        Product p = getObject();
        return ProductTransferObject.builder()
                .skuNumber(p.getSkuNumber())
                .name(p.getName())
                .desc(p.getDesc())
                .price(p.getPrice())
                .build();
    }
}
