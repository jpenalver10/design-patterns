package com.alpegagroup.training.patterns.model;

public class Registered implements State {

    private User user;

    public Registered(User user) {
        this.user = user;
    }

    @Override
    public void activate() {

    }

    @Override
    public void delete() {

    }
}
