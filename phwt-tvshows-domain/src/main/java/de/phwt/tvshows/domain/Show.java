package de.phwt.tvshows.domain;

<<<<<<< HEAD
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Show
{
	public String name;
	public int season;

	public Show()
	{}

	public Show(final String name, final int season)
=======
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
>>>>>>> b71405ad8e3d696d51f13566b4c8ea44903658fc
	{
		this.name = name;
		this.season = season;
	}

	public String getName()
	{
		return name;
	}
}
