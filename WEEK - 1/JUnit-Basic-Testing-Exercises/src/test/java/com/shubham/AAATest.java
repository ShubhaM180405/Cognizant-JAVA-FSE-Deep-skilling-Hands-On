package com.shubham;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AAATest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Setting up Calculator...");
    }

    @After
    public void tearDown() {
        System.out.println("Cleaning up after test...");
    }

    @Test
    public void testAdditionUsingAAA() {

        // Arrange
        int a = 10;
        int b = 20;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals(30, result);
    }
}