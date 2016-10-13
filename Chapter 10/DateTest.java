import java.util.Date;

public class DateTest
{
	public static void main(String[] args)
	{
		Date date = new Date();

		System.out.printf("%tc \n", date);
		System.out.printf("%tr \n", date);
		System.out.printf("%tA, %tB %td \n", date, date, date);

		System.out.printf("%tA, %<tB %<td \n", date);
		//angle bracket is flag specifier that tells the formatter
		//to use the previous arguement again
	}
}