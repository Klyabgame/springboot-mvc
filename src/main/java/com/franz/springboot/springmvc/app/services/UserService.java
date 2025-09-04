package com.franz.springboot.springmvc.app.services;

import com.franz.springboot.springmvc.app.entities.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<User> findAll();
    Optional<User> findById(Long id);

    User save(User user);
    void remove(Long id);

}
