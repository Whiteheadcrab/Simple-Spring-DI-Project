package whiteheadcrab.java.springdi.controllers;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import whiteheadcrab.java.springdi.services.GreetingServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SetterInjectedControllerTest
{
    private SetterInjectedController setterInjectedController;

    @BeforeAll
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
