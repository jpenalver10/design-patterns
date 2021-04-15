package com.alpegagroup.training.patterns.service;

import com.alpegagroup.training.patterns.model.User;

public class UserService {

    public boolean isEmailLinkedToChatUserId(User user) {
        boolean result = false;
        System.out.println("Decision node 1: isEmailLinkedToChatUserId = " + result);
        return result;
    }

    public boolean isAlpegaUserIdLinkedToChatUserId(User user) {
        boolean result = false;
        System.out.println("Decision node 2: isAlpegaUserIdLinkedToChatUserId = " + result);
        return result;
    }

    public void connectUser(User user) {
        System.out.println("Leaf 1: connectUser " + user);
    }

    public void linkAlpegaUserIdToChatUserId(User user) {
        System.out.println("Leaf 2: linkAlpegaUserIdToChatUserId " + user);
    }

    public void linkEmailToChatUserId(User user) {
        System.out.println("Leaf 3: linkEmailToChatUserId " + user);
    }

    public void createChatUserIdAndLinkWithEmailAndAlpegaUserId(User user) {
        System.out.println("Leaf 4: createChatUserIdAndLinkWithEmailAndAlpegaUserId " + user);
    }
}
