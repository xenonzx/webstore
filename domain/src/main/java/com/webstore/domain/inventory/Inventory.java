package com.webstore.domain.inventory;

import lombok.AllArgsConstructor;
import lombok.Getter;


@AllArgsConstructor
public class Inventory {
    // TODO later make it list of warehouses
    @Getter
    final Warehouse warehouse;
}
