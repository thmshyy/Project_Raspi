package de.phwt.tvshows.web;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import de.phwt.tvshows.domain.Show;
import jersey.repackaged.com.google.common.collect.Lists;

@Path("/ShowService")
public class RESTShowService
{
	@GET
	@Produces("application/json")
	public MyJaxbBean getMyBean()
	{
		return new MyJaxbBean("Agamemnon", 32);
	}

	@GET
	@Path("/get")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public List<Show> getShowInJSON()
	{
		return new ShowRepository().getShows();
	}

	/*	@GET
		@Path("/getTitle")
		@Produces(MediaType.APPLICATION_JSON)
		public String getTitleInJSON()
		{
			return new Show("HIMYM", 1).getName();
		}*/

	@Path("/getRespones")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response get()
	{
		final ShowRepository entity = new ShowRepository();
		final GenericEntity<List<ShowRepository>> entity1 = new GenericEntity<List<ShowRepository>>(Lists.newArrayList(entity))
		{};
		//entity = new GenericEntity<List<Stock>>(Lists.newArrayList(stock)) {};
		return Response.ok(entity1).build();
	}

	@GET
	@Path("/getList")
	@Produces({ MediaType.APPLICATION_JSON })
	public GenericEntity<List<Show>> getList()
	{

		return new GenericEntity<List<Show>>(new ShowRepository().getShows())
		{};
	}
}
