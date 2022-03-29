package com.webstore.domain.entity;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;


class Order {
    private UUID id;
    private OrderStatus status;
    private List<LineItem> orderItems;
    private BigDecimal price;
}
