package com.upgrad.quora.service.entity;

import lombok.Data;
import lombok.Setter;

import javax.persistence.*;

@Data
@Setter
@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    String id;
    private String uuid;
    String firstname;
    String  lastname;
    @Column(unique = true)
    String  username;
    @Column(unique = true)
    String  email;
    String  password;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    String  salt;
    String  country;
    String  aboutme;
    String  dob;
    String  role;
    String  contactnumber;

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}
