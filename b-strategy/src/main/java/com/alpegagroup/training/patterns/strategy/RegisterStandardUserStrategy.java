package com.alpegagroup.training.patterns.strategy;

import com.alpegagroup.training.patterns.model.User;
import com.alpegagroup.training.patterns.service.notification.NotificationService;
import com.alpegagroup.training.patterns.service.security.SecurityContext;

public class RegisterStandardUserStrategy extends AbstractRegisterUserStrategy {

    protected RegisterStandardUserStrategy(SecurityContext securityContext, NotificationService notificationService) {
        super(securityContext, notificationService);
    }

    @Override
    public boolean isAuthorized() {
        return securityContext.canCreateUsers();
    }

    @Override
    public void notifyUserCreation(User user) {
        notificationService.sendUserCreationByEmail(user);
    }

}
