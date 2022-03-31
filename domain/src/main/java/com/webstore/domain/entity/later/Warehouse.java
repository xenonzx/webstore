package com.webstore.domain.entity.later;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Map;

@AllArgsConstructor
class Warehouse {
    @Getter
    final Map<ShelfItem, Integer> stock;
}
