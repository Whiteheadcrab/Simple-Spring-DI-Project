package whiteheadcrab.java.springdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import whiteheadcrab.java.springdi.controllers.ConstructorInjectedController;
import whiteheadcrab.java.springdi.controllers.InjectedController;
import whiteheadcrab.java.springdi.controllers.MyController;
import whiteheadcrab.java.springdi.controllers.SetterInjectedController;

@SpringBootApplication
public class SpringdiApplication {

    public static void main(String[] args)
    {
        ApplicationContext ctc =  SpringApplication.run(SpringdiApplication.class, args);

        MyController controller = (MyController) ctc.getBean("myController");

        controller.hello();

        System.out.println(controller.hello());
        System.out.println(ctc.getBean(InjectedController.class).sayHello());
        System.out.println(ctc.getBean(SetterInjectedController.class).sayHello());
        System.out.println(ctc.getBean(ConstructorInjectedController.class).sayHello());
    }
}
