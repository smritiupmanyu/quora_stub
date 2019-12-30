package com.upgrad.quora.api.service;

import com.upgrad.quora.service.business.PasswordCryptographyProvider;
import com.upgrad.quora.service.dao.UserDAO;
import com.upgrad.quora.service.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;


@Component
public class UserService {
    @Autowired
    UserDAO userDAO;

    @Autowired
    PasswordCryptographyProvider passwordCryptographyProvider;

    public void save (User user) {
        user.setUuid(UUID.randomUUID().toString());
        String[] hashedPassword = passwordCryptographyProvider.encrypt(user.getPassword());
        user.setSalt(hashedPassword[0]);
        user.setPassword(hashedPassword[1]);
        userDAO.save(user);
    }



}
