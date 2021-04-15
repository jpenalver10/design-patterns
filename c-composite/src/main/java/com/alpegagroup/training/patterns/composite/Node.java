package com.alpegagroup.training.patterns.composite;

import com.alpegagroup.training.patterns.model.User;

public interface Node {
    void execute(User user);
}
