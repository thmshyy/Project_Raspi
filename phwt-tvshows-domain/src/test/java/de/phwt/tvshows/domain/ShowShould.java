package de.phwt.tvshows.domain;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ShowShould
{
	@Test
	public void knowItsName()
	{
		final Show show = new Show();
		show.setName("Lost");
		assertEquals(show.getName(), 1);
	}
}
