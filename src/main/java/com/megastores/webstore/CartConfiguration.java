package com.megastores.webstore;

import com.megastores.webstore.datasource.DummyCartProvider;
import com.megastores.webstore.datasource.DummyProductsAdapter;
import com.webstore.domainservice.CartService;
import com.webstore.domainservice.CartServiceImpl;
import com.webstore.domain.adapter.ProductAdapter;
import com.webstore.domain.adapter.CartAdapter;
import com.webstore.domain.usecase.AddItemToCartUseCase;
import com.webstore.domain.usecase.ClearCartUseCase;
import com.webstore.domain.usecase.LoadMappedCartUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CartConfiguration {
    @Bean
    CartService provideCartService(LoadMappedCartUseCase loadMappedCartUseCase, AddItemToCartUseCase addItemToCartUseCase, ClearCartUseCase clearCartUseCase) {
        return new CartServiceImpl(loadMappedCartUseCase, addItemToCartUseCase, clearCartUseCase);
    }

    @Bean
    LoadMappedCartUseCase provideLoadMappedCartUseCase(CartAdapter cartRepository) {
        return new LoadMappedCartUseCase(cartRepository);
    }

    @Bean
    ClearCartUseCase provideClearCartUseCase(CartAdapter cartAdapter) {
        return new ClearCartUseCase(cartAdapter);
    }

    @Bean
    AddItemToCartUseCase provideAddItemToCartUseCase(CartAdapter cartAdapter, ProductAdapter productsRepository) {
        return new AddItemToCartUseCase(cartAdapter, productsRepository);
    }

    @Bean
    ProductAdapter provideProductsRepository() {
        return new DummyProductsAdapter();
    }

    @Bean
    CartAdapter provideCartRepository(){
        return new DummyCartProvider();
    }
}
