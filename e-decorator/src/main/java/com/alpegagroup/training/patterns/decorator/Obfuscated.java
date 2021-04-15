package com.alpegagroup.training.patterns.decorator;

import com.alpegagroup.training.patterns.model.User;

public class Obfuscated extends UserServiceDecorator {

    public Obfuscated(UserService decorated) {
        super(decorated);
    }

    public User getUser() {
        return obfuscate(super.getUser());
    }

    private User obfuscate(User user) {

        String obName = "obfuscated[" + user.getName() + "]";
        String obEmail = "obfuscated[" + user.getEmail() + "]";
        String obPwd = "obfuscated[" + user.getPassword() + "]";

        return new User(obName, obEmail, obPwd);
    }
}
