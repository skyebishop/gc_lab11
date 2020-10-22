//store a list of 10 movies in an ArrayList and display them by category: animated, drama, horror, scifi
//when the user enters a category, the movies in that category are displayed
//after the list of movies is displayed, the user is asked if they want to continue. if "no", end program
			//represent each movie by object of type movie
			//Movie class must provide two private fields: title, category (both Strings)
			

package lab11;

public class Movie {
	
	private String title;
	private String category;
	
	public Movie() {
		
	}
	
	public Movie(String title, String category) {
		this.title = title;
		this.category = category;
	}

	// getter
	public String getTitle() {
		// "this." is optional to use an instance variable
		return title;
	}

	// setter
	public void setTitle(String title) {
		// "this." is required when there is ambiguity
		this.title = title;
	}

	// getter
	public String getCategory() {
		// "this." is optional to use an instance variable
		return category;
	}

	// setter
	public void setCategory(String category) {
		// "this." is required when there is ambiguity
		this.category = category;
	}

	public String getUserChoiceTitle(String userChoice) {
		return title;
	}
	
	
	public String toString() {
		return "Movie(title=" + title + ",category=" + category + ")";
	}
	
}
