package com.alpegagroup.training.patterns.service.repository;

import com.alpegagroup.training.patterns.model.User;

public interface UserRepository {

    boolean exists(User user);

    void save(User user);
}
