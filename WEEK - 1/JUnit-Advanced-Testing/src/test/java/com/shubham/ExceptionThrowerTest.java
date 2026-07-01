package com.shubham;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExceptionThrowerTest {

    ExceptionThrower exceptionThrower = new ExceptionThrower();

    @Test
    void testException(){

        assertThrows(IllegalArgumentException.class,
                () -> exceptionThrower.throwException());

    }

}