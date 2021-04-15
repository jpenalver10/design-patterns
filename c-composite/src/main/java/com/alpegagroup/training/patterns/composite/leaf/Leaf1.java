package com.alpegagroup.training.patterns.composite.leaf;

import com.alpegagroup.training.patterns.composite.Node;
import com.alpegagroup.training.patterns.model.User;
import com.alpegagroup.training.patterns.service.UserService;

public class Leaf1 implements Node {

    private UserService userService;

    public Leaf1(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void execute(User user) {
        userService.connectUser(user);
    }
}
