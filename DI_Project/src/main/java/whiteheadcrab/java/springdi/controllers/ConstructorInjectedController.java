package whiteheadcrab.java.springdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import whiteheadcrab.java.springdi.services.GreetingService;

@Controller
public class ConstructorInjectedController
{
    private GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService)
    {
        this.greetingService = greetingService;
    }

    @Autowired
    public String sayHello()
    {
        return greetingService.sayGreeting();
    }
}
