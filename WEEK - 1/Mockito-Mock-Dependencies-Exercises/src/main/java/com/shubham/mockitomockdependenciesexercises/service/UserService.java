package com.shubham.mockitomockdependenciesexercises.service;

import com.shubham.mockitomockdependenciesexercises.entity.User;
import com.shubham.mockitomockdependenciesexercises.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

}