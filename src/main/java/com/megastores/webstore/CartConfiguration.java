package com.megastores.webstore;

import com.webstore.domain.CartService;
import com.webstore.domain.CartServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CartConfiguration {
    @Bean
    CartService provideCartService() {
        return new CartServiceImpl();
    }
}
