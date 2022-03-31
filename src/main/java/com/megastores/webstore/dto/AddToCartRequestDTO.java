package com.megastores.webstore.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@NoArgsConstructor
@Data
public class AddToCartRequestDTO {
    ArrayList<AddItemToCartDTO> list;
}
