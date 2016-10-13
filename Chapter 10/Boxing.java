import java.util.ArrayList;

public class Boxing
{
	//before java 5.0
	public void doNumsOldWay()
	{
		ArrayList listOfNumbers = new ArrayList();
		listOfNumbers.add(new Integer(3));
		Integer one = (Integer) listOfNumbers.get(0);
		int intOne = one.intValue();
	}


	//java 5.0 and after
	public void doNumsNewWay()
	{
		ArrayList<Integer> listOfNumbers = new ArrayList<Integer>();
		listOfNumbers.add(3);							//autoboxing
		int num = listOfNumbers.get(0);		//auto-unboxing
	}

	public void takeNumber(Integer i)
	{
		//can take object as method arguement
		//automatically unwraps to primitive
		//or can pass object reference where
		//primitive is expected
	}


	public Integer giveNumber()
	{
		//can give object as return type
		//automatically unwraps to primitive
		//or can return primitive where
		//object reference is expected
		Integer x = 3;
		return x;
	}


	public void manipulateNum()
	{
		Integer i = new Integer(42);
		i++;
		int j = i+5;
		Integer k = i + j;
		//all statements are valid
	}
}