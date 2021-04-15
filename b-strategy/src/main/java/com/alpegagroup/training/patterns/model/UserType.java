package com.alpegagroup.training.patterns.model;

public enum UserType {

    STANDARD,
    ADMIN;

    public boolean isStandard() {
        return this == STANDARD;
    }

    public boolean isAdmin() {
        return this == ADMIN;
    }

}
