package com.megastores.webstore.dataEntities;

import lombok.AllArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@Table(name = "line")
class LineItemDataEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne
    private final ProductDataEntity product;
    private int quantity;

}
