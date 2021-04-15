package com.alpegagroup.training.patterns.strategy;

import com.alpegagroup.training.patterns.model.User;
import com.alpegagroup.training.patterns.service.notification.NotificationService;
import com.alpegagroup.training.patterns.service.security.SecurityContext;

public final class RegisterUserStrategyFactory {

    // SIMPLE STRATEGY
    // show variants to respect Open Close principle (inject list, apply method, spring)

    private SecurityContext securityContext;
    private NotificationService notificationService;

    public RegisterUserStrategyFactory(SecurityContext securityContext, NotificationService notificationService) {
        this.securityContext = securityContext;
        this.notificationService = notificationService;
    }

    public RegisterUserStrategy getStrategy(User user) {

        if (user.isStandard()) {
            return new RegisterStandardUserStrategy(securityContext, notificationService);
        }

        if (user.isAdmin()) {
            return new RegisterAdminUserStrategy(securityContext, notificationService);
        }

        throw new UnsupportedOperationException("No strategy defined to process user: " + user);
    }

}
