package com.alpegagroup.training.patterns.legacy;

import com.alpegagroup.training.patterns.model.User;

public class UserService {

    private UserRepository userRepository = new UserRepository();
    
    public User getUser() {
        return userRepository.getUser();
    }

    public User getObfuscatedUser() {
        return obfuscate(getUser());
    }

    public User getHashedUser() {
        return hash(getUser());
    }

    public User getObfuscatedAndHashedUser() {
        return hash(obfuscate(getUser()));
    }

    private User obfuscate(User user) {

        String obName = "obfuscated[" + user.getName() + "]";
        String obEmail = "obfuscated[" + user.getEmail() + "]";
        String obPwd = "obfuscated[" + user.getPassword() + "]";

        return new User(obName, obEmail, obPwd);
    }

    private User hash(User user) {

        String obName = "hashed[" + user.getName() + "]";
        String obEmail = "hashed[" + user.getEmail() + "]";
        String obPwd = "hashed[" + user.getPassword() + "]";

        return new User(obName, obEmail, obPwd);
    }

}
