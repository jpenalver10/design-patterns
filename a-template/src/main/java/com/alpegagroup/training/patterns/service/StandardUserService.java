package com.alpegagroup.training.patterns.service;

import com.alpegagroup.training.patterns.model.User;
import com.alpegagroup.training.patterns.service.notification.NotificationService;
import com.alpegagroup.training.patterns.service.repository.UserRepository;
import com.alpegagroup.training.patterns.service.security.SecurityContext;

public final class StandardUserService extends AbstractUserService {

    public StandardUserService(UserRepository userRepository,
                               SecurityContext securityContext,
                               NotificationService notificationService) {

        super(userRepository, securityContext, notificationService);
    }

    @Override
    protected boolean isAuthorized() {
        return securityContext.canCreateUsers();
    }

    @Override
    protected void notifyUserCreation(User user) {
        notificationService.sendUserCreationByEmail(user);
    }
}
