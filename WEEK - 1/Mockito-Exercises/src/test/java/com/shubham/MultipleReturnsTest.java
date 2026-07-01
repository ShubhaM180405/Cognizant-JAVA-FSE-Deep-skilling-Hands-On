package com.shubham;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class MultipleReturnsTest {

    @Test
    void testMultipleReturns(){

        ExternalApi api = mock(ExternalApi.class);

        when(api.getData())
                .thenReturn("First")
                .thenReturn("Second")
                .thenReturn("Third");

        assertEquals("First", api.getData());
        assertEquals("Second", api.getData());
        assertEquals("Third", api.getData());

    }

}