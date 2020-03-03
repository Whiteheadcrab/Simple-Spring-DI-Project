package whiteheadcrab.java.springdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import whiteheadcrab.examplebean.FakeDataSource;
import whiteheadcrab.examplebean.FakeJmsBroker;
import whiteheadcrab.java.springdi.controllers.MyController;

@SpringBootApplication
@ComponentScan(basePackages = {"whiteheadcrab.services" , "whiteheadcrab.java.springdi" , "whiteheadcrab.config" })
public class SpringdiApplication {

    public static void main(String[] args)
    {
        ApplicationContext ctc =  SpringApplication.run(SpringdiApplication.class, args);

        MyController controller = (MyController) ctc.getBean("myController");

        FakeDataSource fakeDataSource = (FakeDataSource) ctc.getBean(FakeDataSource.class);

        System.out.println(fakeDataSource.getUsername());

        FakeJmsBroker fakeJmsBroker = (FakeJmsBroker) ctc.getBean(FakeJmsBroker.class);

        System.out.println(fakeJmsBroker.getUsername());
    }
}
