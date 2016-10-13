public class TestFormats
{
	public static void main(String[] args)
	{
		String s = String.format("%, d", 100000000);
		System.out.println(s);

		s = String.format("I have %.2f bugs to fix.", 476578.09876);
		System.out.println(s);

		s = String.format("I have %,.2f bugs to fix.", 476578.09876);
		System.out.println(s);

		s = String.format("I have got %,d rank out of %,d.", 476578, 893849);
		System.out.println(s);		

		s = String.format("%,6.1f", 42.000);
		System.out.println(s);
	}
}