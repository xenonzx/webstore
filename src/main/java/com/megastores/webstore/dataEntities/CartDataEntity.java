package com.megastores.webstore.dataEntities;

import lombok.AllArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@Table(name = "cart")
public class CartDataEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @OneToMany
    private final List<LineItemDataEntity> items = new ArrayList<>();
}

