package com.alpegagroup.training.patterns.composite.leaf;

import com.alpegagroup.training.patterns.composite.Node;
import com.alpegagroup.training.patterns.model.User;
import com.alpegagroup.training.patterns.service.UserService;

public abstract class AbstractLeaf implements Node {

    protected UserService userService;
    private Node nextNode;

    protected AbstractLeaf(UserService userService, Node nextNode) {
        this.userService = userService;
        this.nextNode = nextNode;
    }

    @Override
    public void execute(User user) {

        doAction(user);
        nextNode.execute(user);
    }

    protected abstract void doAction(User user);
}
