package com.shubham.junitspringtestexercises.service;

import com.shubham.junitspringtestexercises.entity.User;
import com.shubham.junitspringtestexercises.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.shubham.junitspringtestexercises.exception.UserNotFoundException;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User getUserById(Long id) {

        return userRepository.findById(id)
                .orElseThrow(() ->
                        new UserNotFoundException("User not found with id: " + id));
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public User getUserByName(String name) {

        return userRepository.findByName(name)
                .orElseThrow(() ->
                        new UserNotFoundException("User not found with name: " + name));

    }
}