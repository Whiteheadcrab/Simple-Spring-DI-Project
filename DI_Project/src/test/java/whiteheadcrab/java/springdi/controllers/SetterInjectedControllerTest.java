package whiteheadcrab.java.springdi.controllers;

import org.junit.Before;
import org.junit.Test;
import whiteheadcrab.java.springdi.services.GreetingServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SetterInjectedControllerTest
{
    private SetterInjectedController setterInjectedController;

    @Before
    public void setUp() throws Exception
    {
        this.setterInjectedController = new SetterInjectedController();
        this.setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception
    {
        assertEquals(GreetingServiceImpl.HELLO_ALL, setterInjectedController.sayHello());
    }
}
