package com.alpegagroup.training.patterns.model;

public final class User {

    private String login;
    private String password;
    private String email;
    private UserType userType;

    private User(String login, String password, String email, UserType userType) {
        this.login = login;
        this.password = password;
        this.email = email;
        this.userType = userType;
    }

    public static User asStandard(String login, String password, String email) {
        return new User(login, password, email, UserType.STANDARD);
    }

    public static User asAdmin(String login, String password, String email) {
        return new User(login, password, email, UserType.ADMIN);
    }

    @Override
    public String toString() {
        return "User [login=" + login
                + ", password=" + password
                + ", email=" + email
                + ", type=" + userType + "]";
    }
}
