package de.phwt.tvshows.domain;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ShowShould
{
	@Test
	public void knowItsName()
	{
		assertEquals(new Show("the name").getName(), "the name");
	}
}
