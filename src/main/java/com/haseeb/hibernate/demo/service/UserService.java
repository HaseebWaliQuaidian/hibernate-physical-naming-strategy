package com.haseeb.hibernate.demo.service;

import com.haseeb.hibernate.demo.model.User;
import com.haseeb.hibernate.demo.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
@Transactional
public class UserService {
    @Autowired
    UserRepo userRepo;

    public void addUser(String firstName, String lastName){
        User user = new User(firstName,lastName);
    }
}
