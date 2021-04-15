package com.alpegagroup.training.patterns.strategy;

import com.alpegagroup.training.patterns.model.User;
import com.alpegagroup.training.patterns.service.notification.NotificationService;
import com.alpegagroup.training.patterns.service.security.SecurityContext;

public abstract class AbstractRegisterUserStrategy implements RegisterUserStrategy {

    protected SecurityContext securityContext;

    protected NotificationService notificationService;

    protected AbstractRegisterUserStrategy(SecurityContext securityContext, NotificationService notificationService) {
        this.securityContext = securityContext;
        this.notificationService = notificationService;
    }

    @Override
    public abstract boolean isAuthorized();

    @Override
    public abstract void notifyUserCreation(User user);
}
