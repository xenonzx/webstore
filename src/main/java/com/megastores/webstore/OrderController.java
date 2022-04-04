package com.megastores.webstore;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class OrderController {

    @GetMapping("/v1/order/")
    public String welcome() {
        return "orders page";
    }

}
