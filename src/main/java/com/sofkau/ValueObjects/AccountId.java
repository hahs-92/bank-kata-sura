package com.sofkau.ValueObjects;

import java.util.UUID;

public class AccountId {
    private String id;

    public AccountId() {
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return this.id;
    }
}
