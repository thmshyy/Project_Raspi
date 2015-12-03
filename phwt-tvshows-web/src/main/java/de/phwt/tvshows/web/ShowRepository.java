package de.phwt.tvshows.web;

import java.util.ArrayList;
import java.util.List;

public class ShowRepository //implements ShowService
{
	public List<Show> getShows()
	{
		final ArrayList<Show> shows = new ArrayList<>();
		shows.add(new Show("How I Met Your Mother", 2));
		shows.add(new Show("Lost", 5));
		shows.add(new Show("The Bing Bang Theory", 3));
		shows.add(new Show("Game of Thrones", 7));

		return shows;
	}
}
