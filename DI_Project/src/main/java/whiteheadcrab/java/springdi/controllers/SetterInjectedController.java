package whiteheadcrab.java.springdi.controllers;

import whiteheadcrab.java.springdi.services.GreetingService;
import whiteheadcrab.java.springdi.services.GreetingServiceImpl;

public class SetterInjectedController
{
    private GreetingService greetingService;

    String sayHello()
    {
        return greetingService.sayGreeting();
    }
    public void setGreetingService(GreetingService greetingService)
    {
        this.greetingService = greetingService;
    }
}
