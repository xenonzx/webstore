package com.megastores.webstore;

import com.megastores.webstore.dto.AddToCartRequestDTO;
import com.webstore.domain.transfer.CartTransferObject;
import com.webstore.domainservice.CartService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class CartController {
    final CartService service;

    @GetMapping("/v1/cart/{id}")
    public CartTransferObject getCart(@PathVariable Long id) {
        return service.getCart(id);
    }

    @PostMapping("/v1/cart/{id}")
    public void addToCart(@RequestBody AddToCartRequestDTO body, @PathVariable Long id) {
        //TODO
        body.getList().forEach(addItemToCart -> service.addLineItem(id, addItemToCart.getSkuNumber(), addItemToCart.getQuantity()));
    }
}
