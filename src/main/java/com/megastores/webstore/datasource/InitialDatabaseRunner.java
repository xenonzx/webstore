package com.megastores.webstore.datasource;


import com.megastores.webstore.dataEntities.CartDataEntity;
import com.megastores.webstore.dataEntities.ProductDataEntity;
import com.megastores.webstore.dataEntities.User;
import com.megastores.webstore.repo.CartRepository;
import com.megastores.webstore.repo.ProductRepository;
import com.megastores.webstore.repo.UserRepository;
import com.megastores.webstore.security.AdminRole;
import com.megastores.webstore.security.UserRole;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@NoArgsConstructor
public class InitialDatabaseRunner implements CommandLineRunner {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private CartRepository cartRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        ArrayList<ProductDataEntity> products = new ArrayList<ProductDataEntity>(
                List.of(
                        new ProductDataEntity(1L, "product 1:", "short desc", 10.0, 10, "2020"),
                        new ProductDataEntity(2L, "product 2:", "short desc", 20.0, 10, "2021"),
                        new ProductDataEntity(3L, "product 3:", "short desc", 30.0, 10, "2022"),
                        new ProductDataEntity(4L, "rare product :", "short desc", 5.0, 2, "2020"),
                        new ProductDataEntity(5L, "coming soon product", "short desc", 30.0, 0, "2023")
                )
        );
        productRepository.saveAll(products);
        cartRepository.save(new CartDataEntity());
        cartRepository.save(new CartDataEntity());
        userRepository.save(new User(1L, "user", "1234", "ROLE_USER"));
        userRepository.save(new User(2L, "admin", "1234", "ROLE_ADMIN"));

    }
}
