package com.alpegagroup.training.patterns.model;

public final class User {

    private String email;

    public User(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "User [email=" + email + "]";
    }
}
