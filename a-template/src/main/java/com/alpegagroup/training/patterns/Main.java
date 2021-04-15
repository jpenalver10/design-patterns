package com.alpegagroup.training.patterns;

import com.alpegagroup.training.patterns.infra.notification.NotificationServiceImpl;
import com.alpegagroup.training.patterns.infra.repository.UserRepositoryImpl;
import com.alpegagroup.training.patterns.infra.security.SecurityContextImpl;
import com.alpegagroup.training.patterns.model.User;
import com.alpegagroup.training.patterns.service.AdminUserService;
import com.alpegagroup.training.patterns.service.StandardUserService;
import com.alpegagroup.training.patterns.service.UserService;
import com.alpegagroup.training.patterns.service.notification.NotificationService;
import com.alpegagroup.training.patterns.service.repository.UserRepository;
import com.alpegagroup.training.patterns.service.security.SecurityContext;

public class Main {

    private static final String LOGIN = "login";
    private static final String PASSWORD = "password";
    private static final String EMAIL = "email";

    private static UserRepository userRepository = new UserRepositoryImpl();
    private static SecurityContext securityContext = new SecurityContextImpl();
    private static NotificationService notificationService = new NotificationServiceImpl();

    public static void main(String[] args) {

        // The request are arriving by different endpoints (eg. rest calls).
        // The decision to use one specialization is made at compile-time, we've two specialized services.

        // PUT /users/standard
        registerStandardUser();

        // PUT /users/admin
        registerAdminUser();
    }

    private static void registerStandardUser() {
        User standard = User.asStandard(LOGIN, PASSWORD, EMAIL);
        UserService standardUserService = new StandardUserService(userRepository, securityContext, notificationService);
        standardUserService.register(standard);
    }

    private static void registerAdminUser() {
        User standard = User.asAdmin(LOGIN, PASSWORD, EMAIL);
        UserService userService = new AdminUserService(userRepository, securityContext, notificationService);
        userService.register(standard);
    }

}
