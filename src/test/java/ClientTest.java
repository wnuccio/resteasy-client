import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.core.UriBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;
import org.junit.jupiter.api.Test;

public class ClientTest {

    @Test
    void get_google_page_as_string() {
        ResteasyClient client = (ResteasyClient) ClientBuilder.newClient();
        UriBuilder url = UriBuilder.fromPath("http://www.google.com");

        ResteasyWebTarget target = client.target(url);
        ServiceInterface proxy = target.proxy(ServiceInterface.class);

        String result = proxy.getSample();

        System.out.println(result);
    }
}
