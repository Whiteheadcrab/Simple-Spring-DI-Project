package whiteheadcrab.java.springdi.controllers;

import org.springframework.stereotype.Controller;
import whiteheadcrab.java.springdi.SpringdiApplication;

@Controller
public class MyController
{
    public String hello()
    {
        System.out.println("Hi!");

        return ("foo");
    }
}
