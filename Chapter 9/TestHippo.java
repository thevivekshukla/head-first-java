class Animal
{
	public Animal()
	{
		System.out.println("Animal...");
	}
}


class Hippo extends Animal
{
	public Hippo()
	{
		System.out.println("Hippo....");
	}
}



public class TestHippo
{
	public static void main(String[] args)
	{
		System.out.println("Starting....");
		Hippo h = new Hippo();
	}
}