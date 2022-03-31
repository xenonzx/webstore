package com.megastores.webstore.datasource;


import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.megastores.webstore.dataEntities.ProductDataEntity;

import java.util.ArrayList;
import java.util.List;

@Component
public class InitialDatabaseRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        ArrayList<ProductDataEntity> products = new ArrayList<ProductDataEntity>(
                List.of(
                        new ProductDataEntity(1, "product 1:", "short desc", 10.0, 10, "2020"),
                        new ProductDataEntity(2, "product 2:", "short desc", 20.0, 10, "2021"),
                        new ProductDataEntity(3, "product 3:", "short desc", 30.0, 10, "2022"),
                        new ProductDataEntity(4, "rare product :", "short desc", 5.0, 2, "2020"),
                        new ProductDataEntity(5, "coming soon product", "short desc", 30.0, 0, "2023")
                )
        );

    }
}
