package zinjvi.messenger.api.rest.client;

import org.apache.cxf.jaxrs.client.JAXRSClientFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import zinjvi.messenger.api.rest.EmailProvider;

@Configuration
public class MessengerApiRestClientSpringConfigurator {

    public static final String SERVICE_ADDRESS_PATTERN = "http://%s:%s/%s";

    @Value("${messenger-api-rest-client.host}")
    private String host;
    @Value("${messenger-api-rest-client.port}")
    private String port;
    @Value("${messenger-api-rest-client.root-url}")
    private String rootUrl;

    @Bean
    public EmailProvider emailProvider() {
        return createClient(EmailProvider.class);
    }

    private <T> T createClient(Class<T> aClass) {
        return JAXRSClientFactory.create(String.format(SERVICE_ADDRESS_PATTERN, host, port, rootUrl), aClass);
    }

}
