package com.megastores.webstore;

import com.webstore.domain.order.Cart;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class WebStoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebStoreApplication.class, args);
    }

    @GetMapping("/v1/orders")
    public String getOrder() {
        return "in progress";
    }
    Cart getDummyCart(){

    }
}
