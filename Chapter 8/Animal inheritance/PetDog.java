//defining an interface

interface Pet
{
	public abstract void beFriendly();
	public abstract void play();
}



public class PetDog extends Canine implements Pet
{
	public void makeNoise()
	{
		System.out.println("Dog is making noise...");
	}

	public void eat()
	{
		System.out.println("Dog is eating...");
	}

	public void lick()
	{
		System.out.println("licking..");
	}

	public void beFriendly()
	{
		System.out.println("being friendly");
	}

	public void play()
	{
		System.out.println("playing");
	}
}