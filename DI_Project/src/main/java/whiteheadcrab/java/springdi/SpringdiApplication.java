package whiteheadcrab.java.springdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import whiteheadcrab.java.springdi.controllers.ConstructorInjectedController;
import whiteheadcrab.java.springdi.controllers.InjectedController;
import whiteheadcrab.java.springdi.controllers.MyController;
import whiteheadcrab.java.springdi.controllers.SetterInjectedController;

@SpringBootApplication
@ComponentScan(basePackages = {"whiteheadcrab.services" , "whiteheadcrab.java.springdi"})
public class SpringdiApplication {

    public static void main(String[] args)
    {
        ApplicationContext ctc =  SpringApplication.run(SpringdiApplication.class, args);

        MyController controller = (MyController) ctc.getBean("myController");

    }
}
