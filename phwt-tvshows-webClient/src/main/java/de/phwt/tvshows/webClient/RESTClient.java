package de.phwt.tvshows.webClient;

import java.net.URI;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation.Builder;
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
		//System.out.println(webTarget.path("rest").path("ShowService").path("getShows").request().accept("application/json"));

		// json
		//System.out.println(webTarget.path("rest").path("ShowService").path("getShows").request().accept(MediaType.APPLICATION_JSON).get(String.class));
		final String response = webTarget.path("rest").path("ShowService").path("getShows").request().accept(MediaType.APPLICATION_JSON).get(String.class);
		final Builder response1 = webTarget.path("rest").path("ShowService").path("getShows").request().accept(MediaType.APPLICATION_JSON);
		System.out.println(response);
		//System.out.println(response1);
	}

	public String getList()
	{
		final ClientConfig clientConfig = new ClientConfig();
		final Client client = ClientBuilder.newClient(clientConfig);
		final URI serviceURI = UriBuilder.fromUri(webServiceURI).build();
		final WebTarget webTarget = client.target(serviceURI);

		// json
		final String response = webTarget.path("rest").path("ShowService").path("getShows").request().accept(MediaType.APPLICATION_JSON).get(String.class);

		return response;
	}
	/*private convertToHTML()
	{
		return;
	}*/
}