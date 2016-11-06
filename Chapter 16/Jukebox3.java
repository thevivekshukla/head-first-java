import java.util.*;
import java.io.*;

public class Jukebox3
{
	ArrayList<Song> songList = new ArrayList<Song>();

	public static void main(String[] args)
	{
		new Jukebox3().go();
	}

	public void go()
	{
		getSongs();
		System.out.println(songList);
		Collections.sort(songList);
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
		Song nextSong = new Song(tokens[0], tokens[1], tokens[2], tokens[3]);
		songList.add(nextSong);
	}

}