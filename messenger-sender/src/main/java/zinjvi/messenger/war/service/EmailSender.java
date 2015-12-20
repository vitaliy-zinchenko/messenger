package zinjvi.messenger.war.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

/**
 * Created by Vitaliy on 12/12/2015.
 */
@Service
public class EmailSender {

    @Autowired
    private JmsTemplate jmsTemplate;

    private static final Logger LOG = LoggerFactory.getLogger(EmailSender.class);

    public void triggerSend() {
        jmsTemplate.convertAndSend("template id 0");
    }

}
