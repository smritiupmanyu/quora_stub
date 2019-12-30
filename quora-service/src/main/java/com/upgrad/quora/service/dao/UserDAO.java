package com.upgrad.quora.service.dao;

import com.upgrad.quora.service.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO extends CrudRepository<User,Integer> {
}
