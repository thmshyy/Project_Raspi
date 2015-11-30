package de.phwt.tvshows.web;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MyJaxbBean
{
	public String name;

	public MyJaxbBean()
	{} // JAXB needs this

	public MyJaxbBean(final String name, final int age)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}
}