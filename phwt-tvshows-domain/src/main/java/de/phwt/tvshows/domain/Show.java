package de.phwt.tvshows.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Show
{
	public String name;
	public int season;

	public Show()
	{}

	public Show(final String name, final int season)
	{
		this.name = name;
		this.season = season;
	}

	public String getName()
	{
		return name;
	}
}