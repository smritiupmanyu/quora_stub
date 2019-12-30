package com.upgrad.quora.service.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    String id;
    String uuid;
    String firstname;
    String  lastname;
    @Column(unique = true)
    String  username;
    @Column(unique = true)
    String  email;
    String  password;
    @GeneratedValue(strategy = GenerationType.AUTO)
    String  salt;
    String  country;
    String  aboutme;
    String  dob;
    String  role;
    String  contactnumber;
}
