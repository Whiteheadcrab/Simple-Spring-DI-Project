package whiteheadcrab.java.springdi.controllers;

import org.springframework.stereotype.Controller;
import whiteheadcrab.services.GreetingService;

@Controller
public class MyController
{
    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {

        this.greetingService = greetingService;
    }

    public String hello()
    {
        System.out.println("Hi!");

        return greetingService.sayGreeting();
    }
}
