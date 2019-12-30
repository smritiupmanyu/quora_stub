package com.upgrad.quora.service.entity;

import lombok.Data;

@Data
public class User {
    String id;
    String uuid;
    String firstname;
    String  lastname;
    String  username;
    String  email;
    String  password;
    String  salt;
    String  country;
    String  aboutme;
    String  dob;
    String  role;
    String  contactnumber;
}
