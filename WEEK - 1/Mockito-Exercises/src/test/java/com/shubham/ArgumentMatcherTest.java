package com.shubham;

import org.junit.jupiter.api.Test;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

public class ArgumentMatcherTest {

    @Test
    void testArgumentMatcher(){

        ExternalApi api = mock(ExternalApi.class);

        MyService service = new MyService(api);

        service.sendMessage("Hello Mockito");

        verify(api).log(anyString());

    }

}