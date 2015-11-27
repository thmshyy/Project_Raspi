package de.phwt.tvshows.persistence;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import de.phwt.tvshows.domain.Show;

public class JpaShowService
{
	public static void main(final String[] args)
	{

		final EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Eclipselink_JPA");
		final EntityManager entitymanager = emfactory.createEntityManager();

		//		Show show;
		//		show = entitymanager.find(Show.class, "Lost");
		final List<Show> shows = entitymanager.createQuery("SELECT s FROM Show s", Show.class).getResultList();

		System.out.println(shows);
		entitymanager.close();
		emfactory.close();

	}

}
