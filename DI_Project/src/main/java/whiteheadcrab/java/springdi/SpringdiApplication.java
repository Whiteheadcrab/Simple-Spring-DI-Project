package whiteheadcrab.java.springdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import whiteheadcrab.java.springdi.controllers.MyController;

@SpringBootApplication
public class SpringdiApplication {

    public static void main(String[] args)
    {
      ApplicationContext ctc =  SpringApplication.run(SpringdiApplication.class, args);

        MyController controller = (MyController) ctc.getBean("myController");

        controller.hello();
    }
}
