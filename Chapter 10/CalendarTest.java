import java.util.Calendar;

public class CalendarTest
{
	public static void main(String[] args)
	{
		Calendar c = Calendar.getInstance();

		c.set(2004, 0, 7, 15, 40);	//set time to jan 7, 2004 at 15:40

		long day1 = c.getTimeInMillis();	//converting into miliseconds
		day1 += 1000 * 60 *60;						//adding one hour of miliseconds
		c.setTimeInMillis(day1);					//updating time in miliseconds
		System.out.println("new hour "+ c.get(c.HOUR_OF_DAY));

		c.add(c.DATE, 35);								//add 35 days to date, which takes us to february
		System.out.println("add 35 days "+ c.getTime());

		c.roll(c.DATE, 35);								//will take 35 days ahead without changing month
		System.out.println("roll 35 days "+ c.getTime());

		c.set(c.DATE, 1);									//setting date to 1, not incrementing
		System.out.println("set to 1 "+ c.getTime());
	}
}