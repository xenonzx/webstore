package com.webstore.domain;

import com.webstore.domain.order.Cart;
import com.webstore.domain.order.LineItem;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.stream.Collectors;

interface TransferObject {
}

@Data
class CartTransferObject implements TransferObject {
    final List<LineItemTransferObject> items;
}

@Data
@Builder
class LineItemTransferObject implements TransferObject {
    final long skuNumber;
    final String productName;
    final int quantity;
    final Double total;
}

@AllArgsConstructor
abstract class TransferObjectMapper<T, M extends TransferObject> {
    private final T obj;

    abstract M map();

    protected T getObject() {
        return obj;
    }
}


class CartMapper extends TransferObjectMapper<Cart, CartTransferObject> {
    public CartMapper(Cart cart) {
        super(cart);
    }

    @Override
    CartTransferObject map() {
        List<LineItemTransferObject> items = getObject()
                .getItems()
                .stream()
                .map(li -> new LineItemMapper(li).map())
                .collect(Collectors.toList());
        return new CartTransferObject(items);
    }
}

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