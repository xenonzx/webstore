package com.webstore.domain.storelisting;

import com.webstore.domain.inventory.Inventory;
import lombok.AllArgsConstructor;

import java.util.List;

// Store list is the root entity
// responsible for the visibility of items on store
// can make item available or unavailable  on store this is a todo
// can change product price if user is store listing admin this is a todo
@AllArgsConstructor
class StoreList {
    final Inventory inventory;

    List<Product> listAllInStockProducts() {

        // TODO
        return List.of(new Product(1L, "", "", 0.0));
    }
}
