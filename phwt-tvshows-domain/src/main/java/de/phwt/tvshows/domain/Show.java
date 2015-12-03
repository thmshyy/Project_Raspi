package de.phwt.tvshows.domain;

//import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Show//implements Serializable
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private int staffel;

	public int getStaffel()
	{
		return staffel;
	}

	public void setStaffel(final int staffel)
	{
		this.staffel = staffel;
	}

	private String name;

	public String getName()
	{
		return name;
	}

	public void setName(final String name)
	{
		this.name = name;
	}

	//@Override
	//public String toString()
	//{
	//	return "Hallo";
	//}

}