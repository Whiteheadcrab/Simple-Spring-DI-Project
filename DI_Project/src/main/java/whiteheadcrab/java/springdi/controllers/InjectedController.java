package whiteheadcrab.java.springdi.controllers;

public class InjectedController
{
    public GreetingServiceImpl greetingService;

    String sayHello()
    {
        return getGreetingService().sayGreeting();
    }

    public GreetingServicesImpl getGreetingService()
    {
        return greetingService;
    }
}
