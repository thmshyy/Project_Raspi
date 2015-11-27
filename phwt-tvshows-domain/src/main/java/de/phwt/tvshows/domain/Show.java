package de.phwt.tvshows.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
//@NoSql(dataType = "Show", dataFormat = DataFormatType.MAPPED)
public class Show
{

	//	@Lob

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "_id")
	private long id;
	//	@Column(name = "_name")
	//	private Long id;
	@Basic
	@Column(name = "name")
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
