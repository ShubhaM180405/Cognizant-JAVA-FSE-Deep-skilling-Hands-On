package com.shubham.mockitomockdependenciesexercises.controller;

import com.shubham.mockitomockdependenciesexercises.entity.User;
import com.shubham.mockitomockdependenciesexercises.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id) {
        return userService.getUserById(id);
    }

}