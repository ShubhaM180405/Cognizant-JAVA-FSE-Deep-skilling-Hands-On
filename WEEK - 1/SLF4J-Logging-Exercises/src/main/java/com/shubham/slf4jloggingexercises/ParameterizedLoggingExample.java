package com.shubham.slf4jloggingexercises;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParameterizedLoggingExample {

    private static final Logger logger = LoggerFactory.getLogger(ParameterizedLoggingExample.class);

    public static void main(String[] args) {

        String username = "Shubham Sangram Bej";
        int age = 21;

        logger.info("User {} is {} years old.", username, age);

        logger.debug("User {} logged in successfully.", username);

    }
}