package zinjvi.messenger.war;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.jms.support.converter.MappingJackson2MessageConverter;
import org.springframework.jms.support.converter.MessageConverter;

import javax.jms.ConnectionFactory;

/**
 * Created by Vitaliy on 12/20/2015.
 */
@Configuration
public class JmsConfig {

    @Value("${messenger-war.jms-broker-url}")
    private String jmsBrokerUrl;

    @Bean
    public ConnectionFactory connectionFactory() {
        return new ActiveMQConnectionFactory(jmsBrokerUrl);
    }

    @Bean
    public MessageConverter messageConverter() {
        MappingJackson2MessageConverter converter = new MappingJackson2MessageConverter();
//        converter.
        return converter;
    }

    @Bean
    public JmsTemplate jmsTemplate() {
        JmsTemplate jmsTemplate = new JmsTemplate(connectionFactory()); //TODO test
        jmsTemplate.setMessageConverter(messageConverter());
        return jmsTemplate;
    }

}
