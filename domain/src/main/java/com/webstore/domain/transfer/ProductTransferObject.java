package com.webstore.domain.transfer;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ProductTransferObject implements TransferObject {
    final long skuNumber;
    final String name;
    final String desc;
    final Double price;
}
