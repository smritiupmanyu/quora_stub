package com.upgrad.quora.api.controller;

import com.upgrad.quora.service.entity.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/user")
public class UserController {

    @PostMapping(path= "/signup", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Object> signup(@RequestBody User user)
    {
        return null;
    }
}
