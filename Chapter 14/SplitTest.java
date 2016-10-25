import java.io.*;

public class SplitTest
{
	public static void main(String[] args)
	{
		String temp = "this, is, a, sample, string, to, test, split, function";
		String[] str = temp.split(",");
		for (String s : str)
			System.out.println(s);
	}
}