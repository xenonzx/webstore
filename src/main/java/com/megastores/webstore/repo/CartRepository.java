package com.megastores.webstore.repo;

import com.megastores.webstore.converter.CartConverter;
import com.megastores.webstore.dataEntities.CartDataEntity;
import com.webstore.domain.adapter.CartAdapter;
import com.webstore.domain.entity.Cart;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CartRepository extends JpaRepository<CartDataEntity, Long> {
}

