package com.megastores.webstore;

import com.webstore.domain.CartService;
import com.webstore.domain.CartServiceImpl;
import com.webstore.domain.ProductsProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CartConfiguration {
    @Bean
    CartService provideCartService(ProductsProvider productsProvider) {
        return new CartServiceImpl(productsProvider);
    }

    @Bean
    ProductsProvider provideProductsProvider() {
        return new DummyProductsAdapter();
    }
}
