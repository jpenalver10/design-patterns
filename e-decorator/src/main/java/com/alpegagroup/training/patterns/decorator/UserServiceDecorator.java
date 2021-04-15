package com.alpegagroup.training.patterns.decorator;

import com.alpegagroup.training.patterns.model.User;

public abstract class UserServiceDecorator implements UserService {

    private UserService decorated;

    protected UserServiceDecorator(UserService decorated) {
        this.decorated = decorated;
    }

    @Override
    public User getUser() {
        return decorated.getUser();
    }
}
