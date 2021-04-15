package com.alpegagroup.training.patterns.infra.repository;

import com.alpegagroup.training.patterns.model.User;
import com.alpegagroup.training.patterns.service.repository.UserRepository;

public class UserRepositoryImpl implements UserRepository {

    @Override
    public boolean exists(User user) {
        System.out.println("Checking user existence: " + user);
        return false;
    }

    @Override
    public void save(User user) {
        System.out.println("Saving user: " + user);
    }
}
