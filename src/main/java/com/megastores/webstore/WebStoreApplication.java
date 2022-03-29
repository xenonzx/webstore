package com.megastores.webstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class WebStoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebStoreApplication.class, args);
    }



//    Cart getDummyCart() {
//        Product p = new Product(1, "product 1", "p1 is great", 1.0);
//        LineItem lineItem = new LineItem(p, 5);
//        ArrayList<LineItem> lineItems = new ArrayList<LineItem>(List.of(lineItem));
//        return new Cart(lineItems);
//    }
}
