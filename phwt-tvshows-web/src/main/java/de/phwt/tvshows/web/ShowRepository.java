package de.phwt.tvshows.web;

import java.util.ArrayList;
import java.util.List;

import de.phwt.tvshows.domain.Show;

public class ShowRepository //implements ShowService
{
	public List<Show> getShows()
	{
		final List<Show> shows = new ArrayList<>();
		shows.add(new Show());
		shows.add(new Show());
		shows.add(new Show());
		return shows;
	}
}
