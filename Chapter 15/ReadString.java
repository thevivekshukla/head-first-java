import java.io.*;

public class ReadString
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		while (true)
		{
			String line = reader.readLine();
			System.out.println("You typed:: "+ line);
			if (line.equals("stop"))
				break;
		}
	}
}