package com.alpegagroup.training.patterns.legacy;

import com.alpegagroup.training.patterns.model.User;

public class UserRepository {

    public User getUser() {
        return new User("Alice", "alice@alpegagroup.com", "super-secret");
    }
}
