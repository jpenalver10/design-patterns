package com.alpegagroup.training.patterns.service;

import com.alpegagroup.training.patterns.model.User;
import com.alpegagroup.training.patterns.service.notification.NotificationService;
import com.alpegagroup.training.patterns.service.repository.UserRepository;
import com.alpegagroup.training.patterns.service.security.SecurityContext;

public abstract class AbstractUserService implements UserService {

    private UserRepository userRepository;

    protected SecurityContext securityContext;

    protected NotificationService notificationService;

    protected AbstractUserService(UserRepository userRepository,
                                  SecurityContext securityContext,
                                  NotificationService notificationService) {

        this.userRepository = userRepository;
        this.securityContext = securityContext;
        this.notificationService = notificationService;
    }

    @Override
    public void register(User user) {

        // validate existence
        if (userRepository.exists(user)) {
            throw new RuntimeException("User exists: " + user);
        }

        // validate authorization
        if (!isAuthorized()) {
            throw new RuntimeException("Connected user is not allowed to create user: " + user);
        }

        // persist the user
        userRepository.save(user);

        // notify user creation
        notifyUserCreation(user);
    }

    protected abstract boolean isAuthorized();

    protected abstract void notifyUserCreation(User user);
}
