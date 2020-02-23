package whiteheadcrab.java.springdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import whiteheadcrab.services.GreetingService;


@Controller
public class InjectedController
{
    @Autowired
    @Qualifier("greetingServiceImpl")
    public GreetingService greetingServiceImpl;

    public String sayHello()
    {
        return greetingServiceImpl.sayGreeting();
    }
}
