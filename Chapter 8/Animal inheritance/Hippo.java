public class Hippo extends Animal
{
	public void makeNoise()
	{
		System.out.println("Hippo is making noise");
	}

	public void eat()
	{
		System.out.println("Hippo is eating..");
	}

	public void roam()
	{
		System.out.println("Hippo is roaming...");
	}

	//overriding method
	@Override
	public void sleep()
	{
		System.out.println("Hippo is sleeping....");
	}
}