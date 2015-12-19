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

		final EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("EclipselinkJPA");
		final EntityManager entitymanager = emfactory.createEntityManager();

		final List<Show> shows = entitymanager.createQuery("SELECT s FROM Show s").getResultList();

		System.out.println("Shows: " + shows);

		//		for (int i = 0; i < shows.size(); i++)

		//		{
		//			System.out.println(shows.get(i).getName() + " " + shows.get(i).getSeason());
		//		}

		entitymanager.close();
		emfactory.close();
	}

}
