package com.webstore.domain.transfer;

import lombok.AllArgsConstructor;

@AllArgsConstructor
abstract class TransferObjectMapper<T, M extends TransferObject> {
    private final T obj;

    abstract M map();

    protected T getObject() {
        return obj;
    }
}


