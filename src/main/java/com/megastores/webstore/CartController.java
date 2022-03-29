package com.megastores.webstore;

import com.webstore.domain.CartService;
import com.webstore.domain.transfer.CartTransferObject;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class CartController {
    final CartService service;

    @GetMapping("/v1/cart")
    public CartTransferObject getCart() {
        return service.getCart();
    }
}
