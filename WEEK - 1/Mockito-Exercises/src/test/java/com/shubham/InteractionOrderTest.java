package com.shubham;

import org.junit.jupiter.api.Test;
import org.mockito.InOrder;

import static org.mockito.Mockito.*;

public class InteractionOrderTest {

    @Test
    void testInteractionOrder(){

        ExternalApi api = mock(ExternalApi.class);

        api.log("First");

        api.log("Second");

        InOrder order = inOrder(api);

        order.verify(api).log("First");

        order.verify(api).log("Second");

    }

}