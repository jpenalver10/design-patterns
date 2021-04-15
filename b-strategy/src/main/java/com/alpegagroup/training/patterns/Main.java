package com.alpegagroup.training.patterns;

import com.alpegagroup.training.patterns.infra.notification.NotificationServiceImpl;
import com.alpegagroup.training.patterns.infra.repository.UserRepositoryImpl;
import com.alpegagroup.training.patterns.infra.security.SecurityContextImpl;
import com.alpegagroup.training.patterns.model.User;
import com.alpegagroup.training.patterns.service.UserService;
import com.alpegagroup.training.patterns.service.UserServiceImpl;
import com.alpegagroup.training.patterns.service.notification.NotificationService;
import com.alpegagroup.training.patterns.service.repository.UserRepository;
import com.alpegagroup.training.patterns.service.security.SecurityContext;
import com.alpegagroup.training.patterns.strategy.RegisterUserStrategyFactory;

public class Main {

    private static final String LOGIN = "login";
    private static final String PASSWORD = "password";
    private static final String EMAIL = "email";

    // service initialization
    private static UserRepository userRepository = new UserRepositoryImpl();
    private static SecurityContext securityContext = new SecurityContextImpl();
    private static NotificationService notificationService = new NotificationServiceImpl();
    private static RegisterUserStrategyFactory strategyFactory = new RegisterUserStrategyFactory(securityContext, notificationService);
    private static UserService userService = new UserServiceImpl(userRepository, strategyFactory);

    public static void main(String[] args) {

        // The request are arriving through a unique endpoint (eg. a queue system)
        // so the decision to use one specialization is made at runtime.

        User standard = User.asStandard(LOGIN, PASSWORD, EMAIL);
        userService.register(standard);

        User admin = User.asAdmin(LOGIN, PASSWORD, EMAIL);
        userService.register(admin);
    }

}
