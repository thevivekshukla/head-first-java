import java.io.*;
import java.net.*;

public class ClientClass
{
	public static void main(String[] args)
	{
		ClientClass client = new ClientClass();
		client.go();
	}

	public void go()
	{
		try
		{
			while (true)
			{
				Socket s = new Socket("127.0.0.1", 5000);
				InputStreamReader streamReader = new InputStreamReader(s.getInputStream());
				BufferedReader reader = new BufferedReader(streamReader);
				
				System.out.println(reader.readLine());
				reader.close();
			}
				
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
	}

}