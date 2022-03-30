package com.megastores.webstore;

import com.megastores.webstore.datasource.DummyCartProvider;
import com.megastores.webstore.datasource.DummyProductsAdapter;
import com.webstore.domainservice.CartService;
import com.webstore.domainservice.CartServiceImpl;
import com.webstore.domain.ProductRepository;
import com.webstore.domain.repo.CartRepository;
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
    LoadMappedCartUseCase provideLoadMappedCartUseCase(CartRepository cartRepository) {
        return new LoadMappedCartUseCase(cartRepository);
    }

    @Bean
    ClearCartUseCase provideClearCartUseCase(CartRepository cartRepository) {
        return new ClearCartUseCase(cartRepository);
    }

    @Bean
    AddItemToCartUseCase provideAddItemToCartUseCase(CartRepository cartRepository, ProductRepository productsRepository) {
        return new AddItemToCartUseCase(cartRepository, productsRepository);
    }

    @Bean
    ProductRepository provideProductsRepository() {
        return new DummyProductsAdapter();
    }

    @Bean
    CartRepository provideCartRepository(){
        return new DummyCartProvider();
    }
}
