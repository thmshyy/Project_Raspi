package de.phwt.tvshows.persistence;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import de.phwt.tvshows.domain.Show;

public class JpaShowService
{

	private static final String PERSISTENCE_UNIT_NAME = "EclipselinkJPA";
	private static EntityManagerFactory factory;

	public List<Show> getShows()
	{
		factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		final EntityManager em = factory.createEntityManager();

		List<Show> shows = new ArrayList<>();
		shows = em.createQuery("SELECT x FROM Show x").getResultList();

		em.close();
		return shows;
	}

}
