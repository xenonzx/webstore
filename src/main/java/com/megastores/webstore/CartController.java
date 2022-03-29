package com.megastores.webstore;

import com.webstore.domain.order.Cart;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartController {
    @GetMapping("/v1/cart")
    public Cart getCart() {
        return new Cart();
    }
}
