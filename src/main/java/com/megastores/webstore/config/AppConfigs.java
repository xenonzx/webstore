package com.megastores.webstore.config;


import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
public
class AppConfigs {

    @Value("${app.name}")
    private String name;

    public String getName() {
        return name;
    }
}
