//will compile but not run
//as no value is assigned to i;
//will show NullPointerException

public class TestBox
{
	Integer i;
	int j;

	public static void main(String[] args)
	{
		TestBox t = new TestBox();
		t.go();
	}

	public void go()
	{
		j = i;
		System.out.println(i);
		System.out.println(j);
	}
}