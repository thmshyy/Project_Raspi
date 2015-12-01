package de.phwt.tvshows.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.eclipse.persistence.nosql.annotations.DataFormatType;
import org.eclipse.persistence.nosql.annotations.Field;
import org.eclipse.persistence.nosql.annotations.NoSql;

@Entity
@NoSql(dataFormat=DataFormatType.MAPPED)
public class Show
{
	@Id
	@GeneratedValue
	@Field(name = "_id")
	private String id;

	private String name;

	public void setName(final String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}
}
