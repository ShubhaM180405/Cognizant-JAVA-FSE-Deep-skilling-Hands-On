package com.shubham.slf4jloggingexercises;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingExample {

    private static final Logger logger = LoggerFactory.getLogger(LoggingExample.class);

    public static void main(String[] args) {

        logger.error("Hi Bro, This is an error message");

        logger.warn("Hi Bro, This is a warning message");

    }
}