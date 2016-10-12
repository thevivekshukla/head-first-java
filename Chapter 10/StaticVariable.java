public class StaticVariable
{
	private int size;
	private static int objCount = 0;

	public StaticVariable()
	{
		objCount++;
		System.out.println(objCount);
	}

	public static void main(String[] args)
	{
		StaticVariable sv = new StaticVariable();
		StaticVariable sv2 = new StaticVariable();
		StaticVariable sv3 = new StaticVariable();
	}

}