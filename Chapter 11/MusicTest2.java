//ducking the exception

import javax.sound.midi.*;

public class MusicTest2
{
	public void play() throws MidiUnavailableException
	{
		Sequencer sequencer = MidiSystem.getSequencer();
		System.out.println("Successfully got a sequencer");
	}

	public static void main(String[] args) throws MidiUnavailableException
	{
		MusicTest1 mt = new MusicTest1();
		mt.play();
	}

}