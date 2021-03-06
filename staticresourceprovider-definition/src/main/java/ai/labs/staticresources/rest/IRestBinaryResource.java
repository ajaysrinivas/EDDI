package ai.labs.staticresources.rest;

import org.jboss.resteasy.annotations.cache.Cache;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * @author ginccc
 */
@Path("/binary")
public interface IRestBinaryResource {
    int ONE_DAY_IN_SECONDS = 60 * 60 * 24;

    @GET
    @Cache(maxAge = ONE_DAY_IN_SECONDS, sMaxAge = ONE_DAY_IN_SECONDS, isPrivate = true)
    @Path("/{path:.*}")
    Response getBinary(@PathParam("path") String path);
}
