package com.webstore.domain.transfer;

import lombok.Data;

import java.util.List;

@Data
public
class CartTransferObject implements TransferObject {
    final List<LineItemTransferObject> items;
}
