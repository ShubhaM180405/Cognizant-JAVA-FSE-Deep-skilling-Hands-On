package com.shubham;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class VoidMethodTest {

    @Test
    void testVoidMethod(){

        ExternalApi api = mock(ExternalApi.class);

        doNothing().when(api).log(anyString());

        MyService service = new MyService(api);

        service.sendMessage("Testing");

        verify(api).log("Testing");

    }

}