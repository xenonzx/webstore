package com.webstore.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;


@AllArgsConstructor
class Inventory {
    // TODO later make it list of warehouses
    @Getter
    final Warehouse warehouse;
}
