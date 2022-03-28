package com.megastores.webstore.inventory;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Map;

@AllArgsConstructor
public class Warehouse {
    @Getter
    final Map<ShelfItem, Integer> stock;
}
