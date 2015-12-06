package de.phwt.tvshows.persistence;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import de.phwt.tvshows.domain.Show;

public class JpaShowService
{
	public static void main(final String[] args)
	{
		final EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Eclipselink_JPA");
		final EntityManager entitymanager = emfactory.createEntityManager();

		final List<Show> shows = entitymanager.createQuery("SELECT s FROM Show s", Show.class).getResultList();

		System.out.println("==========================================================");
		System.out.println("Shows: " + shows);
		System.out.println("==========================================================");
		
		entitymanager.close();
		emfactory.close();
	}
}
