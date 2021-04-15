package com.alpegagroup.training.patterns.model;

public final class User {

    private String alpegaUserId;
    private String email;

    public User(String alpegaUserId, String email) {
        this.alpegaUserId = alpegaUserId;
        this.email = email;
    }

    public String getAlpegaUserId() {
        return alpegaUserId;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "User [alpegaUserId=" + alpegaUserId
                + ", email=" + email + "]";
    }
}
