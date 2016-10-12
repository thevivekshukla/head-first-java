//demonstrating some of static method of Math class
public class MathTest
{
	public static void main(String[] args)
	{
		double r1 = Math.random();
		int r2 = (int) (Math.random() * 5);
		System.out.println("Random: r1="+ r1 +" \nr2="+ r2);

		int x = Math.abs(-240);
		double y = Math.abs(240.25);
		System.out.println("Absolute: x="+ x +" \ny="+ y);

		int a = Math.round(-24.8f);
		int b = Math.round(24.45f);
		System.out.println("Round: a="+ a +" \nb="+ b);

		int p = Math.min(24, 240);
		double q = Math.min(90876.5, 90876.49);
		System.out.println("Minimum: p="+ p +" \nq="+ q);

		int i = Math.max(24, 240);
		double j = Math.max(90876.5, 90876.49);
		System.out.println("Round: i="+ i +" \nj="+ j);

	}
}