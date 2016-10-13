public class ToStringTest
{
	public static void main(String[] args)
	{
		double d = 42.5;
		String doubleString = "" + d;

		double d2 = 32.43;
		String doubleString2 = Double.toString(d2);
	}
}