package com.webstore.domain.transfer;

import com.webstore.domain.entity.Cart;

import java.util.List;
import java.util.stream.Collectors;

public class CartMapper extends TransferObjectMapper<Cart, CartTransferObject> {
    public CartMapper(Cart cart) {
        super(cart);
    }

    @Override
    public CartTransferObject map() {
        List<LineItemTransferObject> items = getObject()
                .getItems()
                .stream()
                .map(li -> new LineItemMapper(li).map())
                .collect(Collectors.toList());
        return new CartTransferObject(items);
    }
}
