class Movie
{
	String title;
	String genre;
	int rating;

	void playIt()
	{
		System.out.println("Movie is playing: "+ title);
	}
}


public class MovieTest
{
	public static void main(String[] args)
	{
		Movie one = new Movie();
		one.title = "3 iditos";
		one.genre = "drama";
		one.rating = 3;

		Movie two = new Movie();
		two.title = "Z war";
		two.genre = "action";
		two.rating = 4;

		one.playIt();
		two.playIt();
	}
}