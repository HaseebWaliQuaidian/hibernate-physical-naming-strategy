package com.haseeb.hibernate.demo.runner;

import com.haseeb.hibernate.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class Runner implements CommandLineRunner {

    @Autowired
    UserService userService;

    @Override
    public void run(String... args) throws Exception {
        userService.addUser();
    }
}
