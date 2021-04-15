package com.alpegagroup.training.patterns.decorator;

import com.alpegagroup.training.patterns.legacy.UserRepository;
import com.alpegagroup.training.patterns.model.User;

public final class UserServiceImpl implements UserService {

    private UserRepository userRepository = new UserRepository();

    @Override
    public User getUser() {
        return userRepository.getUser();
    }

}
