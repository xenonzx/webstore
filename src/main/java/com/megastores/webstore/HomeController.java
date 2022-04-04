package com.megastores.webstore;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class HomeController {

    @GetMapping("/")
    public String welcome() {
        return "welcome to webstore";
    }

}
