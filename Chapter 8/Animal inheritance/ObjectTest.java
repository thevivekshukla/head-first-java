public class ObjectTest
{
	public static void main(String[] args)
	{
		Dog d = new Dog();
		Cat c = new Cat();

		//checking if cat object is equals dog object
		if (c.equals(d))
			System.out.println("true");
		else
			System.out.println("false");


		//getting class name
		System.out.println(d.getClass());
		System.out.println(c.getClass());


		//printing hasCode
		System.out.println(d.hashCode());
		System.out.println(c.hashCode());


		//printing string message for particular object
		System.out.println(d.toString());
		System.out.println(c.toString());

	}
}