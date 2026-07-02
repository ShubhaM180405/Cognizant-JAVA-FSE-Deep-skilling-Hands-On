package com.shubham.mockitomockdependenciesexercises;

import com.shubham.mockitomockdependenciesexercises.entity.User;
import com.shubham.mockitomockdependenciesexercises.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class UserIntegrationTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    void testSaveAndFetchUser() {

        User user = new User(1L, "Shubham");

        userRepository.save(user);

        User result = userRepository.findById(1L).orElse(null);

        assertEquals("Shubham", result.getName());
    }
}