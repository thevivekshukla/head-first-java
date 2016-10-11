//demonstrating polymorphism through interface


interface Running
{
	void run();
}


class Athelete implements Running
{
	public void run()
	{
		System.out.println("Player is running...");
	}
}


public class AtheleteTest
{
	public void doSomething(Running r)
	{
		r.run();
	}

	public static void main(String[] args)
	{
		AtheleteTest at = new AtheleteTest();
		Athelete a = new Athelete();

		at.doSomething(a);
	}
}