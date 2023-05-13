package com.example.spring_boot.service;

import com.example.spring_boot.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    void saveUser (User user);

    User getUser(Long id);

    void deleteUser(Long id);

    void updateUser(Long id, User updateUser);
}
