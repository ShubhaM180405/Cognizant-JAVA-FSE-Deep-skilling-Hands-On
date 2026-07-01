package com.shubham;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class VerifyInteractionTest {

    @Test
    void testVerifyInteraction(){

        ExternalApi api = mock(ExternalApi.class);

        when(api.getData()).thenReturn("Mockito");

        MyService service = new MyService(api);

        service.fetchData();

        verify(api).getData();

    }

}