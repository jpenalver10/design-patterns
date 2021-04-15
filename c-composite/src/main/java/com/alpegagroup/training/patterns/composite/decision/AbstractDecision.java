package com.alpegagroup.training.patterns.composite.decision;

import com.alpegagroup.training.patterns.composite.Node;
import com.alpegagroup.training.patterns.model.User;
import com.alpegagroup.training.patterns.service.UserService;

public abstract class AbstractDecision implements Node {

    protected UserService userService;
    private Node toGoWhenYes;
    private Node toGoWhenNo;

    protected AbstractDecision(UserService userService, Node toGoWhenYes, Node toGoWhenNo) {
        this.userService = userService;
        this.toGoWhenYes = toGoWhenYes;
        this.toGoWhenNo = toGoWhenNo;
    }

    @Override
    public void execute(User user) {

        if (condition(user)) {
            toGoWhenYes.execute(user);
        } else {
            toGoWhenNo.execute(user);
        }

    }

    protected abstract boolean condition(User user);

}
