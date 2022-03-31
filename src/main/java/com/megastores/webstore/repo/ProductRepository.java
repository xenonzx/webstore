package com.megastores.webstore.repo;

import com.megastores.webstore.dataEntities.ProductDataEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<ProductDataEntity, Long> {
}
