package com.megastores.webstore.dataEntities;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "product")
public class ProductDataEntity {
    @Id
    Long skuNumber;
    String name;
    String desc;
    Double price;
    int availableQuantity;
    String season;
}
