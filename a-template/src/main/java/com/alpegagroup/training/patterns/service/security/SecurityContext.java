package com.alpegagroup.training.patterns.service.security;

public interface SecurityContext {

    boolean canCreateUsers();
    boolean isAdmin();

}
