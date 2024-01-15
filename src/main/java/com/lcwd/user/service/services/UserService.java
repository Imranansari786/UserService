package com.lcwd.user.service.services;

import com.lcwd.user.service.entities.User;

import java.util.List;

public interface UserService {

    //create user operations

    //create user
    public User addUser(User user);
    //get all users
    public List<User> getAllUsers();
    //get signal user
    public User getUserById(String userId);
    //update user details
    public User updateUser(User user);
    //delete user

}
