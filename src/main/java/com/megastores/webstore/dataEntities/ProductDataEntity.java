package com.megastores.webstore.dataEntities;

import lombok.AllArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@AllArgsConstructor
@Table(name = "product")
public class ProductDataEntity {
    @Id
    final long skuNumber;
    final String name;
    final String desc;
    final Double price;
    final int availableQuantity;
    final String season;
}
