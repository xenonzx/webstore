package com.megastores.webstore.repo;

import com.megastores.webstore.dataEntities.CartDataEntity;
import com.megastores.webstore.dataEntities.LineItemDataEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LineItemRepository extends JpaRepository<LineItemDataEntity, Long> {
}

