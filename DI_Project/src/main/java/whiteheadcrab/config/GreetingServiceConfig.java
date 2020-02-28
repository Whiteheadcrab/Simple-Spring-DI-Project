package whiteheadcrab.config;

import org.graalvm.compiler.lir.CompositeValue;
import org.springframework.context.annotation.*;
import whiteheadcrab.services.GreetingRepository;
import whiteheadcrab.services.GreetingService;
import whiteheadcrab.services.GreetingServiceFactory;

@Configuration
@ComponentScan("whiteheadcrab.services")
public class GreetingServiceConfig
{
    @Bean
    GreetingServiceFactory greetingServiceFactory(GreetingRepository repository)
    {
        return new GreetingServiceFactory(repository);
    }

    @Bean
    @Primary
    @Profile({"default","en"})
    GreetingService primaryGreetingService(GreetingServiceFactory greetingServiceFactory)
    {
        return greetingServiceFactory.createGreetingService("en");
    }

    @Bean
    @Primary
    @Profile({"es"})
    GreetingService primarySpanishGreetingService(GreetingServiceFactory greetingServiceFactory)
    {
        return greetingServiceFactory.createGreetingService("es");
    }

    @Bean
    @Primary
    @Profile({"de"})
    GreetingService primaryGermanGreetingService(GreetingServiceFactory greetingServiceFactory)
    {
        return greetingServiceFactory.createGreetingService("de");
    }
}
