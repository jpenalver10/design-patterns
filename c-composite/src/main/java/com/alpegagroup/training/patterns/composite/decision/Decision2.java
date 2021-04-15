package com.alpegagroup.training.patterns.composite.decision;

import com.alpegagroup.training.patterns.composite.Node;
import com.alpegagroup.training.patterns.model.User;
import com.alpegagroup.training.patterns.service.UserService;

public class Decision2 extends AbstractDecision {

    public Decision2(UserService userService, Node toGoWhenYes, Node toGoWhenNo) {
        super(userService, toGoWhenYes, toGoWhenNo);
    }

    @Override
    protected boolean condition(User user) {
        return userService.isAlpegaUserIdLinkedToChatUserId(user);
    }
}
