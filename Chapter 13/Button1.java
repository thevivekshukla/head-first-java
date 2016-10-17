import javax.swing.*;
import java.awt.*;

public class Button1
{
	public static void main(String[] args)
	{
		Button1 b = new Button1();
		b.go();
	}

	public void go()
	{
		JFrame frame = new JFrame();
		JButton east = new JButton("east");
		JButton west = new JButton("west");
		JButton north = new JButton("north");
		JButton south = new JButton("south");
		JButton center = new JButton("center");
		
		//Font bigFont = new Font("serif", Font.BOLD, 28);
		//button.setFont(bigFont);

		frame.getContentPane().add(BorderLayout.EAST, east);
		frame.getContentPane().add(BorderLayout.WEST, west);
		frame.getContentPane().add(BorderLayout.NORTH, north);
		frame.getContentPane().add(BorderLayout.SOUTH, south);
		frame.getContentPane().add(BorderLayout.CENTER, center);

		frame.setSize(400, 400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}