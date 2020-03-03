package whiteheadcrab.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import whiteheadcrab.examplebean.FakeDataSource;
import whiteheadcrab.examplebean.FakeJmsBroker;

@Configuration
@PropertySource({"classpath:datasource.properties","classpath:jms.properties"})
public class PropertyConfig {
    @Autowired
    Environment env;

    @Value("${whiteheadcrab.username}")
    String user;

    @Value("${whiteheadcrab.password}")
    String password;

    @Value("${whiteheadcrab.dburl}")
    String url;

    @Value("${whiteheadcrab.jms.username}")
    String jmsUsername;

    @Value("${whiteheadcrab.jms.password}")
    String jmsPassword;

    @Value("${whiteheadcrab.jms.url}")
    String jmsUrl;

    @Bean
    public FakeDataSource fakeDataSource() {
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUsername(env.getProperty("USERNAME"));
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);
        return fakeDataSource;
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker()
    {
        FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
        fakeJmsBroker.setUsername(jmsUsername);
        fakeJmsBroker.setPassword(jmsPassword);
        fakeJmsBroker.setUrl(jmsUrl);
        return fakeJmsBroker;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties()
    {
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;
    }
}
