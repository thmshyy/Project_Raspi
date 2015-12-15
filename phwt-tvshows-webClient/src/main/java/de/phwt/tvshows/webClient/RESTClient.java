package de.phwt.tvshows.webClient;

import java.net.URI;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import org.glassfish.jersey.client.ClientConfig;

public class RESTClient
{

	private static final String webServiceURI = "http://localhost:8080/phwt-tvshows-web";

	public static void main(final String[] args)
	{
		final ClientConfig clientConfig = new ClientConfig();
		final Client client = ClientBuilder.newClient(clientConfig);
		final URI serviceURI = UriBuilder.fromUri(webServiceURI).build();
		final WebTarget webTarget = client.target(serviceURI);

		// response
		System.out.println(webTarget.path("rest").path("ShowService").path("getShows").request().accept("application/json").get(Response.class).toString());

		// json
		System.out.println(webTarget.path("rest").path("ShowService").path("getShows").request().accept("application/json").get(String.class));

		// json
		System.out.println(webTarget.path("rest").path("ShowService").path("getShows").request().accept(MediaType.APPLICATION_JSON).get(String.class));
	}
}

/*	public static void main(final String[] args)
	{
		try
		{
			System.out.println("Output from Server .... \n");

			final Client client = ClientBuilder.newClient(new ClientConfig());
			//.register(MyClientResponseFilter.class)
			//.register(new AnotherClientFilter()));

			final String entity = client.target("http://localhost:8080/phwt-tvshows-web/rest/")
			//.register(FilterForExampleCom.class)
			.path("ShowService/getShows").request("application/json").header("some-header", "true").get(String.class);

			final ClientConfig clientConfig = new ClientConfig();
			final Client client1 = ClientBuilder.newClient(clientConfig);

			final WebTarget webTarget = client1.target("http://localhost:8080/phwt-tvshows-web/rest/");
			//webTarget.register(FilterForExampleCom.class);
			final WebTarget ShowServiceWebTarget = webTarget.path("ShowService");
			final WebTarget getShowsWebTarget = webTarget.path("getShows");

			final Invocation.Builder invocationBuilder = getShowsWebTarget.request("application/json");
			invocationBuilder.header("some-header", "true");

			final Response response = invocationBuilder.get();

			System.out.println(response.getStatus());
			System.out.println(response.readEntity(String.class));

						final ClientResponse response = resource.accept("application/json").get(ClientResponse.class);

						if (response.getStatus() != 200)
						{
							throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
						}

						final String output = response.getEntity(String.class);

			System.out.println("Output from Server .... \n");
			System.out.println(response);

		}
		catch (final Exception e)
		{

			e.printStackTrace();

		}
	}
}*/