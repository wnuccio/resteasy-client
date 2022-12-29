import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/")
public interface ServiceInterface {

    @GET
    @Path("/")
    @Produces({MediaType.APPLICATION_JSON})
    String getSample();
}
