package whiteheadcrab.java.springdi.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService
{
    public static final String HELLO_ALL = "Hello Al!!!";

    @Override
    public String sayGreeting()
    {
        return HELLO_ALL;
    }
}