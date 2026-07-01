package com.shubham;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;

public class PerformanceTesterTest {

    PerformanceTester tester = new PerformanceTester();

    @Test
    void performanceTest(){

        assertTimeout(Duration.ofSeconds(2),
                () -> tester.performTask());

    }

}