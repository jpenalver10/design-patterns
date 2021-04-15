package com.alpegagroup.training.patterns.strategy;

import com.alpegagroup.training.patterns.model.User;

public interface RegisterUserStrategy {

    boolean isAuthorized();

    void notifyUserCreation(User user);

}
