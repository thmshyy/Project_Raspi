package de.phwt.tvshows.web;

import java.io.IOException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import de.phwt.tvshows.persistence.JpaShowService;

@Path("/ShowService")
public class RESTShowService
{
	final ObjectMapper mapper = new ObjectMapper();

	@GET
	@Path("/getShows")
	@Produces("application/json")
	public String getShowsInJSON() throws JsonGenerationException, JsonMappingException, IOException
	{
		return mapper.writeValueAsString(new JpaShowService().getShows());
	}
}
