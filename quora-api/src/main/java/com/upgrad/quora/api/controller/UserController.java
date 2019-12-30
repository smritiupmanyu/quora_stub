package com.upgrad.quora.api.controller;

import com.upgrad.quora.api.service.UserService;
import com.upgrad.quora.service.entity.User;
import com.upgrad.quora.service.exception.SignUpRestrictedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/user")
public class UserController {

    @Autowired
    UserService userService;
    @PostMapping(path= "/signup", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Object> signup(@RequestBody User user)
    {
        try {
            userService.save(user);
            return ResponseEntity.ok(user);
        } catch (SignUpRestrictedException exception){
            return ResponseEntity.ok(exception.getErrorMessage());
        }

    }
}
