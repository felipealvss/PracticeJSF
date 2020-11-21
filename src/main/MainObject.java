package main;

import dao.MovieDAO;
import entity.Movie;

public class MainObject {

	public static void main(String[] args) {
		
		// Insert Values
//		Movie m1 = new Movie();
//		
//		m1.setName("John Wick");
//		m1.setCategory("Religioso");
//		
//		MovieDAO.insertMovie(m1);

		// Select Values
		for ( Movie m : MovieDAO.selectMovie()) {
			System.out.println(m);
		}
		
	}

}