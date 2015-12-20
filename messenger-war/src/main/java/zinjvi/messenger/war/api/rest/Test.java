package zinjvi.messenger.war.api.rest;

import org.apache.cxf.jaxrs.client.JAXRSClientFactory;
import org.springframework.stereotype.Component;
import zinjvi.messenger.api.rest.EmailProvider;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;
import java.awt.print.Book;

/**
 * Created by Vitaliy on 12/12/2015.
 */
@Component
@Provider
@Path("/test")
@Produces(MediaType.APPLICATION_JSON)
public class Test {

    @GET
    public Response send() {
//        Client client = ClientBuilder.newBuilder().newClient();
//        WebTarget target = client.target("http://localhost:8080/api");
//        target = target.path("email/trigger-send").queryParam("a", "avalue");
//
//        Invocation.Builder builder = target.request();
//        Response response = builder.get();
//        Book book = builder.get(Book.class);


        EmailProvider emailProvider = JAXRSClientFactory.create("http://localhost:8080/api", EmailProvider.class);
        emailProvider.send("qwe");

        return Response.ok().build();
    }

}
