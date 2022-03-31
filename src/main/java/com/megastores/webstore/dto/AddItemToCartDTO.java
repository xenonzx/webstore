package com.megastores.webstore.dto;

import lombok.Data;

@Data
public class AddItemToCartDTO {
    final long skuNumber;
    final int quantity;

}
