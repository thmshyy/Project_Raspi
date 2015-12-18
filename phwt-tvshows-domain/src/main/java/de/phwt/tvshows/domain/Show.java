package de.phwt.tvshows.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.eclipse.persistence.nosql.annotations.DataFormatType;
import org.eclipse.persistence.nosql.annotations.Field;
import org.eclipse.persistence.nosql.annotations.NoSql;

@Entity
@NoSql(dataFormat = DataFormatType.MAPPED)
public class Show
{
	@Id
	@GeneratedValue //(strategy = GenerationType.IDENTITY)
	@Field(name = "_id")
	private String id;

	@Field(name = "name")
	private String name;

	public void setName(final String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	@Field(name = "season")
	private int season;

	public int getSeason()
	{
		return season;
	}

	public void setSeason(final int season)
	{
		this.season = season;
	}

	//	private String test;
	//
	//	public String getTest()
	//	{
	//		return test;
	//	}
	//
	//	public void setTest(final String test)
	//	{
	//		this.test = test;
	//	}

	@Override
	public String toString()
	{
		return id + ": " + getName();
	}
}
