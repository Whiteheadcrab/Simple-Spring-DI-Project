package whiteheadcrab.java.springdi.controllers;

import whiteheadcrab.java.springdi.services.GreetingServiceImpl;

public class InjectedController
{
    public GreetingServiceImpl greetingService;

    String sayHello()
    {
        return greetingService.sayGreeting();
    }
}
