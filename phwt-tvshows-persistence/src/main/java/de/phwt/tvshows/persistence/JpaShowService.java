package de.phwt.tvshows.persistence;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import de.phwt.tvshows.domain.Show;

public class JpaShowService
{

	public List<Show> getShows()
	{

		final EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("EclipselinkJPA");
		final EntityManager entitymanager = emfactory.createEntityManager();

		List<Show> shows = new ArrayList();
		shows = entitymanager.createQuery("SELECT s FROM Show s").getResultList();

		entitymanager.close();
		emfactory.close();
		return shows;
	}

}
