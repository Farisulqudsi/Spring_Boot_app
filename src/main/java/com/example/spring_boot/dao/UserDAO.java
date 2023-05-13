package com.example.spring_boot.dao;

import com.example.spring_boot.model.User;

import java.util.List;

public interface UserDAO {

    List<User> getAllUsers();

    void saveUser (User user);

    User getUser(Long id);

    void deleteUser(Long id);
}
