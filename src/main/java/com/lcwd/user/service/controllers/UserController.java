package com.lcwd.user.service.controllers;

import com.lcwd.user.service.entities.User;
import com.lcwd.user.service.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user/v1/api")
public class UserController {

    @Autowired
    private UserService userService;

    // create user http://localhost:8081/user/v1/api/addUser
    @PostMapping("/addUser")
    public ResponseEntity<User> createUser(@RequestBody User user)
    {
        User user1=userService.addUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(user1);
    }
    //get all users http://localhost:8081/user/v1/api/getAllUsers
    @GetMapping("/getAllUsers")
    public ResponseEntity<List<User>> getAllUsers()
    {
        List<User> listOfUser=userService.getAllUsers();
        return ResponseEntity.ok(listOfUser);
    }
    //get single user http://localhost:8081/user/v1/api/getUserById/1
    @GetMapping("/getUserById/{userId}")
    public ResponseEntity<User> getUserById(@PathVariable("userId") String userId)
    {
        User user=userService.getUserById(userId);
        return ResponseEntity.ok(user);
    }
    //update user http://localhost:8081/user/v1/api/updateUser
    @PutMapping("/updateUser")
    public ResponseEntity<User> updateUser(@RequestBody User user)
    {
        User user1=userService.updateUser(user);
        return ResponseEntity.ok(user1);
    }


}
