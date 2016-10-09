class GoodDog
{
	private int size;

	public int getSize()
	{
		return size;
	}

	public void setSize(int aSize)
	{
		size = aSize;
	}

	void bark()
	{
		if (size > 60)
			System.out.println("Woof! Woof!");
		else if (size > 14)
			System.out.println("Yip! Yip!");
		else
			System.out.println("Ruff! Ruff!");
	}
}



public class GoodDogTest
{
	public static void main(String[] args)
	{
		GoodDog one = new GoodDog();
		one.setSize(54);
		GoodDog two = new GoodDog();
		two.setSize(16);
		System.out.println("Dog one: "+ one.getSize());
		System.out.println("Dog two: "+ two.getSize());
		one.bark();
		two.bark();
	}
}