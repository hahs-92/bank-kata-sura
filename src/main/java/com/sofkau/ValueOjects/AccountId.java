package com.sofkau.ValueOjects;

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
