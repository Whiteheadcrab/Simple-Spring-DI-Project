package whiteheadcrab.java.springdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import whiteheadcrab.java.springdi.services.GreetingService;


@Controller
public class InjectedController
{
    @Autowired
    public GreetingService greetingServiceImpl;

    public String sayHello()
    {
        return greetingServiceImpl.sayGreeting();
    }
}
