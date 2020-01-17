package whiteheadcrab.java.springdi.controllers;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import whiteheadcrab.java.springdi.services.GreetingServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PropertyInjectedControllerTest
{
    private InjectedController injectedController;

    @BeforeAll
    public void setUp() throws Exception
    {
        this.injectedController = new InjectedController();
        this.injectedController.greetingService = new GreetingServiceImpl();
    }

    @Test
    public void testGreeting() throws Exception
    {
        assertEquals(GreetingServiceImpl.HELLO_ALL , injectedController.sayHello());
    }
}
