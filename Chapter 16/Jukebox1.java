import java.util.*;
import java.io.*;

public class Jukebox1
{
	ArrayList<String> songList = new ArrayList<String>();

	public static void main(String[] args)
	{
		new Jukebox1().go();
	}

	public void go()
	{
		getSongs();
		System.out.println(songList);
	}

	public void getSongs()
	{
		try
		{
			File myFile = new File("SongList.txt");
			FileReader fileReader = new FileReader(myFile);
			BufferedReader reader = new BufferedReader(fileReader);
			String line;
			while ((line=reader.readLine()) != null)
				addSong(line);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}

	public void addSong(String line)
	{
		String[] tokens = line.split("/");
		songList.add(tokens[0]);
	}

}