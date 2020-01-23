package whiteheadcrab.java.springdi.services;

import org.springframework.stereotype.Service;

@Service
public class PrimarySpanishGreetingService implements  GreetingService
{
    @Override
    public String sayGreeting()
    {
        return "Servicio de Saludo Primario";
    }
}
