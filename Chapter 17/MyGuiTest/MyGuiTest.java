import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class MyGuiTest implements ActionListener
{
	JButton button;
	DrawP draw;

	public static void main(String[] args)
	{
		MyGuiTest gui = new MyGuiTest();
		gui.go();
	}

	public void go()
	{
		button = new JButton("Click me");
		JFrame frame = new JFrame();

		draw = new DrawP();

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(BorderLayout.SOUTH, button);
		frame.getContentPane().add(BorderLayout.CENTER, draw);
		frame.setSize(300, 300);
		frame.setVisible(true);

		button.addActionListener(this);

		while (true)
		{
			draw.repaint();
			try
			{
				Thread.sleep(1000);
			}
			catch (Exception e)
			{}
		}
	}

	public void actionPerformed(ActionEvent e)
	{
		button.setText("you clicked");
		draw.repaint();
	}

}





class DrawP extends JPanel
{
	public void paintComponent(Graphics g)
	{
		int red = (int) (Math.random() * 255);
		int green = (int) (Math.random() * 255);
		int blue = (int) (Math.random() * 255);

		Color color = new Color(red, green, blue);

		g.setColor(Color.black);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());

		g.setColor(color);
		g.fillOval(75, 60, 100, 100);
	}
}