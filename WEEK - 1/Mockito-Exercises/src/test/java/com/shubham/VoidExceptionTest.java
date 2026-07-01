package com.shubham;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

public class VoidExceptionTest {

    @Test
    void testVoidException(){

        ExternalApi api = mock(ExternalApi.class);

        doThrow(new RuntimeException("Error"))
                .when(api)
                .log(anyString());

        assertThrows(RuntimeException.class,
                () -> api.log("Mockito"));

    }

}