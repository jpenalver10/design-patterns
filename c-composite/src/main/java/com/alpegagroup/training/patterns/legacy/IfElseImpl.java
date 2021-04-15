package com.alpegagroup.training.patterns.legacy;

import com.alpegagroup.training.patterns.model.User;
import com.alpegagroup.training.patterns.service.UserService;

public class IfElseImpl {

    private UserService userService;

    public IfElseImpl(UserService userService) {
        this.userService = userService;
    }

    public void provisionUser(User user) {

        if (emailLinkedToChatUserId(user)) {

            if (alpegaUserIdLinkedToChatUserId(user)) {

                connectUser(user);

            } else {

                linkAlpegaUserIdToChatUserId(user);
                connectUser(user);
            }

        } else if (alpegaUserIdLinkedToChatUserId(user)) {

            linkEmailToChatUserId(user);
            connectUser(user);

        } else {

            createChatUserIdAndLinkWithEmailAndAlpegaUserId(user);
            connectUser(user);
        }
    }

    private boolean emailLinkedToChatUserId(User user) {
        return userService.isEmailLinkedToChatUserId(user);
    }

    private boolean alpegaUserIdLinkedToChatUserId(User user) {
        return userService.isAlpegaUserIdLinkedToChatUserId(user);
    }

    private void connectUser(User user) {
        userService.connectUser(user);
    }

    private void linkAlpegaUserIdToChatUserId(User user) {
        userService.linkAlpegaUserIdToChatUserId(user);
    }

    private void linkEmailToChatUserId(User user) {
        userService.linkEmailToChatUserId(user);
    }

    private void createChatUserIdAndLinkWithEmailAndAlpegaUserId(User user) {
        userService.createChatUserIdAndLinkWithEmailAndAlpegaUserId(user);
    }

}
