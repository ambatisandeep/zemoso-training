

import java.util.ArrayList;
import java.util.List;

public class Example {

public static void main(String[] args) {

	//Liskov Substitution in SOLID
		OTT netflix = new Netflix();
		
		netflix.addMovieToList(new Movie("Inception", 9720));
		netflix.addMovieToList(new Movie("Interstellar", 9720));
		netflix.addMovieToList(new Movie("Fight club", 9720));
		Series breakingBad = new Series("Breaking Bad", 108232,5);
		netflix.addMovieToList(breakingBad);
		netflix.displayList();
		netflix.playMovie("Interstellar");
		
		netflix.playMovie("Tenet");

			
}
}
