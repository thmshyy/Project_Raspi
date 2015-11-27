package de.phwt.tvshows.web;

import java.util.ArrayList;
import java.util.List;

import de.phwt.tvshows.domain.Show;

public class ShowRepository //implements ShowService
{
	//	List<Show> listShows();

	public List<Show> getShows()
	{
		final ArrayList<Show> shows = new ArrayList<>();
		shows.add(new Show("How I Met Your Mother"));
		shows.add(new Show("Lost"));
		shows.add(new Show("The Big Bang Theory"));
		shows.add(new Show("Game of Thrones"));

		return shows;
	}

}
