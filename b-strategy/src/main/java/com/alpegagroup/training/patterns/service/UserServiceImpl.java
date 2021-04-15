package com.alpegagroup.training.patterns.service;

import com.alpegagroup.training.patterns.model.User;
import com.alpegagroup.training.patterns.service.repository.UserRepository;
import com.alpegagroup.training.patterns.strategy.RegisterUserStrategy;
import com.alpegagroup.training.patterns.strategy.RegisterUserStrategyFactory;

public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    private RegisterUserStrategyFactory strategyFactory;

    public UserServiceImpl(UserRepository userRepository, RegisterUserStrategyFactory strategyFactory) {
        this.userRepository = userRepository;
        this.strategyFactory = strategyFactory;
    }

    @Override
    public void register(User user) {

        RegisterUserStrategy strategy = strategyFactory.getStrategy(user);

        // validate existence
        if (userRepository.exists(user)) {
            throw new RuntimeException("User exists: " + user);
        }

        // validate authorization
        if (!strategy.isAuthorized()) {
            throw new RuntimeException("Connected user is not allowed to create user: " + user);
        }

        // persist the user
        userRepository.save(user);

        // notify user creation
        strategy.notifyUserCreation(user);

    }
}
