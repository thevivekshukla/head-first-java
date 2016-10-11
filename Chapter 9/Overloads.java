public class Overloads
{
	String name;
	int age;

	public Overloads(String n, int a)
	{
		name = n;
		age = a;
		System.out.println(name +"'s age is "+ age);
	}

	public Overloads(int a, String n)
	{
		this(n, a);
	}

	public static void main(String[] args)
	{
		Overloads o = new Overloads(22, "Vivek");
	}
}