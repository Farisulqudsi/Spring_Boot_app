package com.example.spring_boot.service;

import com.example.spring_boot.model.User;
import com.example.spring_boot.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }

    @Override
    @Transactional
    public void saveUser(User user) {
        userDAO.saveUser(user);
    }

    @Override
    public User getUser(Long id) {
        return userDAO.getUser(id);
    }

    @Override
    @Transactional
    public void deleteUser(Long id) {
        userDAO.deleteUser(id);
    }

    @Override
    @Transactional
    public void updateUser(Long id, User updateUser) {
        User userToBeUpdate = getUser(id);
        userToBeUpdate.setName(updateUser.getName());
        userToBeUpdate.setSurname(updateUser.getSurname());
    }
}
