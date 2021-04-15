package com.alpegagroup.training.patterns.service.notification;

import com.alpegagroup.training.patterns.model.User;

public interface NotificationService {

    void sendUserCreationByEmail(User user);
    void sendUserCreationToAdminApp(User user);

}
