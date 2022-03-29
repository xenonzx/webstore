package com.megastores.webstore;

import com.webstore.domain.order.Cart;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
public class WebStoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebStoreApplication.class, args);
    }

    @GetMapping("/v1/cart")
    public Cart getOrder() {
        return new Cart();
    }

//    Cart getDummyCart() {
//        Product p = new Product(1, "product 1", "p1 is great", 1.0);
//        LineItem lineItem = new LineItem(p, 5);
//        ArrayList<LineItem> lineItems = new ArrayList<LineItem>(List.of(lineItem));
//        return new Cart(lineItems);
//    }
}
