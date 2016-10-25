import java.io.*;
import java.net.*;

public class ServerClass
{
	public static void main(String[] args)
	{
		ServerClass server = new ServerClass();
		server.go();
	}

	public void go()
	{
		try
		{
			ServerSocket serverSock = new ServerSocket(5000);
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			while (true)
			{
				Socket sock = serverSock.accept();
				PrintWriter writer = new PrintWriter(sock.getOutputStream());
				String line = reader.readLine();
				writer.println(line);
				writer.close();
			}
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
	}
}