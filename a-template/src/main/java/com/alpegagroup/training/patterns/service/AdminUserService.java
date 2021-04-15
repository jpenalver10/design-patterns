package com.alpegagroup.training.patterns.service;

import com.alpegagroup.training.patterns.model.User;
import com.alpegagroup.training.patterns.service.notification.NotificationService;
import com.alpegagroup.training.patterns.service.repository.UserRepository;
import com.alpegagroup.training.patterns.service.security.SecurityContext;

public class AdminUserService extends AbstractUserService {

    public AdminUserService(UserRepository userRepository,
                               SecurityContext securityContext,
                               NotificationService notificationService) {

        super(userRepository, securityContext, notificationService);
    }

    @Override
    protected boolean isAuthorized() {
        return securityContext.isAdmin();
    }

    @Override
    protected void notifyUserCreation(User user) {
        notificationService.sendUserCreationToAdminApp(user);
    }
}
