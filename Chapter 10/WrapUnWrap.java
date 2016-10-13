//only for data types, i.e. byte, short, int, long, float, double, boolean
//wrapping means converting primitive into object
//unwrappint means converting object int primitive

public class WrapUnWrap
{
	public static void main(String[] args)
	{
		int i = 238;
		Integer iWrap = new Integer(i);		//wrapping a int
		int unWrapped = iWrap.intValue();	//unwrapping into int
	}
}