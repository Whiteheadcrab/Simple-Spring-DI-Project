package whiteheadcrab.java.springdi.services;


public interface GreetingRepositoryImpl implements GreetingRepositury
{
    @Override
    public String getEnglishGreeting()
    {
        return "Hello - Primary Greeting service";
    }

    @Override
    public String getSpanishGreeting()
    {
        return "Servicio de Saludo Primaris";
    }

    @Override
    public String getGermanGreeting()
    {
        return "Primaren Grubdienst";
    }
}