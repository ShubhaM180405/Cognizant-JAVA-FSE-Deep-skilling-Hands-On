package com.shubham.junitspringtestexercises.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculatorServiceTest {

    private final CalculatorService calculatorService = new CalculatorService();

    @Test
    void testAdd() {

        int result = calculatorService.add(5, 10);

        assertEquals(15, result);

    }

    @ParameterizedTest
    @CsvSource({
            "1,2,3",
            "10,20,30",
            "5,5,10",
            "-2,2,0"
    })
    void testAddParameterized(int a, int b, int expected) {

        assertEquals(expected, calculatorService.add(a, b));

    }

}