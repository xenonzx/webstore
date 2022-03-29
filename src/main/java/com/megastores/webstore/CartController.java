package com.megastores.webstore;

import com.megastores.webstore.rest.AddToCartRequestBody;
import com.webstore.domain.CartService;
import com.webstore.domain.transfer.CartTransferObject;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class CartController {
    final CartService service;

    @GetMapping("/v1/cart")
    public CartTransferObject getCart() {
        return service.getCart();
    }

    @PostMapping("/v1/cart")
    public void addToCart(@RequestBody AddToCartRequestBody.AddItemToCart addItemToCart) {
        service.addLineItem(addItemToCart.getSkuNumber(), addItemToCart.getQuantity());
        //body.getList().forEach(addItemToCart -> service.addLineItem(addItemToCart.getSkuNumber(), addItemToCart.getQuantity()));
    }
}
