import java.util.*;
import java.io.*;

public class Jukebox6
{
	ArrayList<Song> songList = new ArrayList<Song>();

	public static void main(String[] args)
	{
		new Jukebox6().go();
	}

	//inner class
	class ArtistCompare implements Comparator<Song>
	{
		public int compare(Song one, Song two)
		{
			return one.getArtist().compareTo(two.getArtist());
		}
	}

	public void go()
	{
		getSongs();
		System.out.println(songList);
		Collections.sort(songList);
		System.out.println(songList);

		ArtistCompare artistCompare = new ArtistCompare();
		// Collections.sort(songList, artistCompare);
		//System.out.println(songList);

		TreeSet<Song> songSet;

		System.out.println("sorted according to song title.");
		songSet = new TreeSet<Song>();
		songSet.addAll(songList);
		System.out.println(songSet);
		
		System.out.println("sorted according to artist");
		songSet = new TreeSet<Song>(artistCompare);
		songSet.addAll(songList);
		System.out.println(songSet);
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