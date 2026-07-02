package com.shubham.junitspringtestexercises.service;

import com.shubham.junitspringtestexercises.entity.User;
import com.shubham.junitspringtestexercises.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertThrows;
import com.shubham.junitspringtestexercises.exception.UserNotFoundException;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserService userService;

    @Test
    void testGetUserById() {

        User user = new User(1L, "Shubham");

        when(userRepository.findById(1L))
                .thenReturn(Optional.of(user));

        User result = userService.getUserById(1L);

        assertEquals("Shubham", result.getName());
    }
    @Test
    void testUserNotFound() {

        when(userRepository.findById(10L))
                .thenReturn(Optional.empty());

        assertThrows(UserNotFoundException.class, () -> {
            userService.getUserById(10L);
        });
    }

    @Test
    void testGetUserByName() {

        User user = new User(1L, "Shubham");

        when(userRepository.findByName("Shubham"))
                .thenReturn(Optional.of(user));

        User result = userService.getUserByName("Shubham");

        assertEquals("Shubham", result.getName());

    }

}