package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import entity.Movie;
import util.JPAUtil;

public class MovieDAO {

	public static void insertMovie(Movie m) {
		EntityManager em = JPAUtil.createEntityManager();
		em.getTransaction().begin();
		em.persist(m);
		em.getTransaction().commit();
		em.close();
	};
	
	public static List<Movie> selectMovie() {
		EntityManager em = JPAUtil.createEntityManager();
		Query query = em.createQuery("select m from Movie m");
		List<Movie> movieList = query.getResultList();
		em.close();
		return movieList;
	};

}