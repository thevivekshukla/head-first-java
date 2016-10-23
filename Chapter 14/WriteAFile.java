import java.io.*;

public class WriteAFile
{
	public static void main(String[] args)
	{
		try
		{
			FileWriter writer = new FileWriter("Foo.txt");
			//BufferedWriter writeIt = new BufferedWriter(writer);
			writer.write("hello foo! file");
			writer.close();
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
	}
}