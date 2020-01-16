package whiteheadcrab.java.springdi.controllers;

import whiteheadcrab.java.springdi.services.GreetingService;
import whiteheadcrab.java.springdi.services.GreetingServiceImpl;

public class ConstructorInjectedController
{
    private GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService)
    {
        this.greetingService = greetingService;
    }

    String sayHello()
    {
        return greetingService.sayGreeting();
    }
}
