package zinjvi.messenger.war.api.rest.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import zinjvi.messenger.api.rest.EmailProvider;
import zinjvi.messenger.war.service.EmailService;

import javax.ws.rs.core.Response;

/**
 * Created by Vitaliy on 12/12/2015.
 */
@Component
public class EmailProviderImpl implements EmailProvider {

    @Autowired
    private EmailService emailService;

    public Response send(String template) {
        emailService.triggerSend();
        return Response.ok().build();
    }

}
