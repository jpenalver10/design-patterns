package com.alpegagroup.training.patterns.infra.notification;

import com.alpegagroup.training.patterns.model.User;
import com.alpegagroup.training.patterns.service.notification.NotificationService;

public class NotificationServiceImpl implements NotificationService {

    @Override
    public void sendUserCreationByEmail(User user) {
        System.out.println("Sending user creation by email: " + user);
    }

    @Override
    public void sendUserCreationToAdminApp(User user) {
        System.out.println("Sending user creation to Admin app: " + user);
    }
}