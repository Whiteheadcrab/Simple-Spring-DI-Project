package whiteheadcrab.java.springdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import whiteheadcrab.java.springdi.services.GreetingService;

@Controller
public class SetterInjectedController
{
    private GreetingService greetingService;

    public String sayHello()
    {
        return greetingService.sayGreeting();
    }

    @Autowired
    public void setGreetingService(@Qualifier("setterGreetingService")GreetingService greetingService)
    {
        this.greetingService = greetingService;
    }
}
