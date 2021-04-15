package com.alpegagroup.training.patterns.model;

public class Pending implements State {

    private User user;

    public Pending(User user) {
        this.user = user;
    }

    @Override
    public void activate() {
        System.out.println("Activating pending user: " + this);
        user.moveToRegistered();
    }

    @Override
    public void delete() {
        System.out.println("You can't activate a Deleted user: " + this);
    }
}
