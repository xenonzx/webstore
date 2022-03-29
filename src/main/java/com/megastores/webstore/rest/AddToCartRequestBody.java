package com.megastores.webstore.rest;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@NoArgsConstructor
@Data
public class AddToCartRequestBody {
    ArrayList<AddItemToCart> list;
}
