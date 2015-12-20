package zinjvi.messenger.api.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;

/**
 * Created by Vitaliy on 12/12/2015.
 */
@Path("/email")
@Produces(MediaType.APPLICATION_JSON)
public interface EmailProvider {

    @GET
    @Path("/trigger-send/{template}")
    Response send(@PathParam(value = "template") String template);

}
