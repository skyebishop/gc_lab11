package lab11;

import java.util.*;
import lab11.Movie;
//import lab11.Validation;

public class MovieApp {

	private static Scanner scnr = new Scanner(System.in);

	public static void main(String[] args) {

		// use setters to set values
		Movie a = new Movie("The Farewell", "Drama");
		Movie b = new Movie("Portrait of a Lady on Fire", "Drama");
		Movie c = new Movie("Marraige Story", "Drama");
		Movie d = new Movie("Rampage", "Scifi");
		Movie e = new Movie("Dune", "Scifi");
		Movie f = new Movie("Gattaca", "Scifi");
		Movie g = new Movie("Moana", "Animated");
		Movie h = new Movie("Big Hero 6", "Animated");
		Movie i = new Movie("The Incredibles", "Animated");
		Movie j = new Movie("Spirited Away", "Animated");
		Movie k = new Movie("Velvet Buzzsaw", "Horror");
		Movie l = new Movie("The Haunted House", "Horror");
		Movie m = new Movie("Hocus Pocus", "Horror");

		// add Movie values to ArrayList
		List<Movie> movies = new ArrayList<>();
		movies.add(a);
		movies.add(b);
		movies.add(c);
		movies.add(d);
		movies.add(e);
		movies.add(f);
		movies.add(g);
		movies.add(h);
		movies.add(i);
		movies.add(j);
		movies.add(k);
		movies.add(l);
		movies.add(m);


		String userResponse = "null";

		// welcome message
		System.out.println("Welcome to the Movie List App!");
		System.out.println("There are " + movies.size() + " movies in this list\n");

		do {
			System.out.println("What category are you interested in? Drama, Scifi, Animated, or Horror?");
			String userCategory = scnr.nextLine();

			for (Movie movie : movies) {
				if (movie.getCategory().equals(userCategory)) {
					System.out.println(movie.toString());
				}

			}

			System.out.println("Would you like to continue? (yes/no)");
			userResponse = scnr.nextLine();

		} while (userResponse.equals("yes"));

	}
}
