package whiteheadcrab.java.springdi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController
{
    public String hello()
    {
        System.out.println("Hi!");

        return ("foo");
    }
}
