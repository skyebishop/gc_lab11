package lab11;

import java.util.*;

import day09_objects_classes.Student;
import lab11.Movie;

public class MovieApp {

	private static Scanner scnr = new Scanner(System.in);
	
	public static void main(String[] args) {
		
			// use setters to set values	
			Movie a = new Movie("The Farewell","Drama");
			Movie b = new Movie("Portrait of a Lady on Fire","Drama");
			Movie c = new Movie("Marraige Story","Drama");
			
			//add Movie values to ArrayList
			List<Movie> movies = new ArrayList<>();
			movies.add(a);
			movies.add(b);
			movies.add(c);
			
			// welcome message
			System.out.println("Welcome to the Movie List App!");
			System.out.println("There are " + movies.size() + " movies in this list\n");
		//while (Validator.getYesNo
			System.out.println("What category are you interested in? Drama, Scifi, Animated, or Horror?");
			String userChoice = scnr.nextLine();
			
//			List<String> states = new ArrayList<>();
//			states.add("Michigan"); // add to the end
//			states.add("Ohio");
//			
//			for (String color : colors) {
//				System.out.println(color);	
//			}
			
			for (Movie movie : movies) {
					System.out.println("Name: " + movie.getTitle);
					System.out.println("Fav Food: " + movie.getCategory);
			}
			
			for (Movie movie : movies) {
				// use getters to get values
				//System.out.println(movie);
				System.out.println("Title: " + movie.getTitle());
				System.out.println("Category: " + movie.getCategory() + "\n");
				
			}

	}

//	public static String userInterface() {
//		System.out.println("What category are you interested in? Drama, Scifi, Animated, or Horror?");
//		String userChoice = scnr.nextLine();
//		
//		
//		
//	}
	
}
