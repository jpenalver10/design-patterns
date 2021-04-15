package com.alpegagroup.training.patterns.composite.leaf;

import com.alpegagroup.training.patterns.composite.Node;
import com.alpegagroup.training.patterns.model.User;
import com.alpegagroup.training.patterns.service.UserService;

public class Leaf2 extends AbstractLeaf {

    public Leaf2(UserService userService, Node nextNode) {
        super(userService, nextNode);
    }

    @Override
    protected void doAction(User user) {
        userService.linkAlpegaUserIdToChatUserId(user);
    }

}
