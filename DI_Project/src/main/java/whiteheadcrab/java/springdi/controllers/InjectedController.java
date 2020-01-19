package whiteheadcrab.java.springdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import whiteheadcrab.java.springdi.services.GreetingServiceImpl;

@Controller
public class InjectedController
{
    @Autowired
    public GreetingServiceImpl greetingService;

    public String sayHello()
    {
        return greetingService.sayGreeting();
    }
}
