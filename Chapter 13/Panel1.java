import javax.swing.*;
import java.awt.*;

public class Panel1
{
	public static void main(String[] args)
	{
		Panel1 p = new Panel1();
		p.go();
	}

	public void go()
	{
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		panel.setBackground(Color.darkGray);

		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

		JButton button1 = new JButton("shock me");
		JButton button2 = new JButton("click me");

		panel.add(button1);
		panel.add(button2);

		frame.getContentPane().add(BorderLayout.EAST, panel);
		frame.setSize(300, 300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}