package com.alpegagroup.training.patterns;

import com.alpegagroup.training.patterns.decorator.Hashed;
import com.alpegagroup.training.patterns.decorator.Obfuscated;
import com.alpegagroup.training.patterns.decorator.UserService;
import com.alpegagroup.training.patterns.decorator.UserServiceImpl;

public class Main {

    public static void main(String[] args) {

        UserService us = new Hashed(new Obfuscated(new UserServiceImpl()));
        us.getUser();
    }

}
