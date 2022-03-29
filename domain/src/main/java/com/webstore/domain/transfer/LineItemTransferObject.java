package com.webstore.domain.transfer;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
class LineItemTransferObject implements TransferObject {
    final long skuNumber;
    final String productName;
    final int quantity;
    final Double total;
}
