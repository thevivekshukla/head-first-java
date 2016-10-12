public class StaticFinal
{
	//method to initialize a constant with static final

	public static final int FOO_X = 25;

	//OR

	public static final double BAR_SIGN;
	static
	{
		BAR_SIGN = (double) Math.random();
	}
}