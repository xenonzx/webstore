package com.webstore.domainservice;

import com.webstore.domain.transfer.CartTransferObject;
import com.webstore.domain.usecase.AddItemToCartUseCase;
import com.webstore.domain.usecase.ClearCartUseCase;
import com.webstore.domain.usecase.LoadMappedCartUseCase;
import lombok.AllArgsConstructor;

// TODO check if you can split service into multiple usecase
// TODO find a way to inject the cart through constructor injection
@AllArgsConstructor
public class CartServiceImpl implements CartService {
    final LoadMappedCartUseCase loadCartUseCase;
    final AddItemToCartUseCase addItemToCartUseCase;
    final ClearCartUseCase clearCartUseCase;

    @Override
    public CartTransferObject getCart(int id) {
        return loadCartUseCase.invoke(id);
    }

    @Override
    public void addLineItem(int id, long skuNumber, int quantity) {
        // TODO validate over skuNumberFormat (not sure if this is the place for validation)
        // TODO handle if product is not found here
        // TODO handel quantity ( should be the responsibility of the cart)
        addItemToCartUseCase.invoke(id,skuNumber,quantity);
    }

    @Override
    public void clearCart(int id) {
        clearCartUseCase.invoke(id);
    }
}
