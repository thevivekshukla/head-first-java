public class Foo
{
	//final int x;
	static int z;

	public void go()
	{
		//System.out.println(x);
	}

	public void go2()
	{
		System.out.println(z);
	}

	public static void main(String[] args)
	{
		Foo f = new Foo();
		f.go();		//give error: variable x not initialized

		f.go2();	//will work
	}
}