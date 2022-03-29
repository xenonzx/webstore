package com.webstore.domain.transfer;

import com.webstore.domain.entity.LineItem;

class LineItemMapper extends TransferObjectMapper<LineItem, LineItemTransferObject> {
    public LineItemMapper(LineItem obj) {
        super(obj);
    }

    @Override
    LineItemTransferObject map() {
        return LineItemTransferObject.builder()
                .productName(getObject().getProduct().getName())
                .skuNumber(getObject().getProduct().getSkuNumber())
                .quantity(getObject().getQuantity())
                .total(getObject().getTotalPrice())
                .build();

    }
}
