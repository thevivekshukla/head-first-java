public class Duck
{
	private int size;

	public static void main(String[] args)
	{
		System.out.println("Size of the duck is "+ size);
		//this would give an error
		//as we cannot call non-static instance varible from static method

		System.out.println("Size of the duck is "+ getSize());
		//this would also give an error
		//as we cannot call non-static method from static method
	}

	public void setSize(int s)
	{
		size = s;
	}

	public int getSize()
	{
		return size;
	}
}