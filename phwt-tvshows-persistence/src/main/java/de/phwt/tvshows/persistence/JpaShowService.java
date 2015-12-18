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

/*package de.phwt.tvshows.persistence;

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

	public static void main(final String[] args)
	{

		factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		final EntityManager em = factory.createEntityManager();

		// read the existing entries and write to console
		//		final Query q = em.createQuery("SELECT x.id FROM Show x", Show.class);
		//		final List<Show> showList = q.getResultList();
		List<Show> shows = new ArrayList<>();
		shows = em.createQuery("SELECT x FROM Show x").getResultList();

		for (int i = 0; i < shows.size(); i++)
		//	for (final Show show : shows)
		{
			System.out.println(shows.get(i).getName() + " " + shows.get(i).getStaffel());
		}
		//		System.out.println("Show ID: " + showList.size());

		// create new show
		//em.getTransaction().begin();
		//final Show show = new Show();
		//show.setId(2);
		//show.setName("Lost");
		//em.persist(show);
		//em.getTransaction().commit();

		em.close();

	}

	public List<Show> getShows()
	{
		System.out.println("TEst");
		factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		final EntityManager em = factory.createEntityManager();

		// read the existing entries and write to console
		//		final Query q = em.createQuery("SELECT x.id FROM Show x", Show.class);
		//		final List<Show> showList = q.getResultList();
		List<Show> shows = new ArrayList<>();
		shows = em.createQuery("SELECT x FROM Show x").getResultList();

		for (int i = 0; i < result.size(); i++)
		//	for (final Show show : shows)
		{
			shows.add(new Show(result.get(i).), element); ( + " " + shows.get(i).getStaffel());
		}
		//		System.out.println("Show ID: " + showList.size());

		// create new show
		//em.getTransaction().begin();
		//final Show show = new Show();
		//show.setId(2);
		//show.setName("Lost");
		//em.persist(show);
		//em.getTransaction().commit();

		em.close();
		return shows;
	}

}*/
