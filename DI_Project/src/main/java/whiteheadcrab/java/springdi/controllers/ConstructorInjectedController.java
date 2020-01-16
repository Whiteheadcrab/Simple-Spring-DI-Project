package whiteheadcrab.java.springdi.controllers;

import whiteheadcrab.java.springdi.services.GreetingServiceImpl;

public class ConstructorInjectedController
{
    private GreetingServiceImpl greetingService;

    public ConstructorInjectedController(GreetingServiceImpl greetingService)
    {
        this.greetingService = greetingService;
    }

    String sayHello()
    {
        return greetingService.sayGreeting();
    }
}
