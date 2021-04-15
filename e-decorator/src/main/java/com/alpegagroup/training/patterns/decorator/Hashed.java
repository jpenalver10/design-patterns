package com.alpegagroup.training.patterns.decorator;

import com.alpegagroup.training.patterns.model.User;

public class Hashed extends UserServiceDecorator {

    public Hashed(UserService decorated) {
        super(decorated);
    }

    public User getUser() {
        return hash(super.getUser());
    }

    private User hash(User user) {

        String obName = "hashed[" + user.getName() + "]";
        String obEmail = "hashed[" + user.getEmail() + "]";
        String obPwd = "hashed[" + user.getPassword() + "]";

        return new User(obName, obEmail, obPwd);
    }
}
