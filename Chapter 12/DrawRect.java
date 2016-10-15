import java.awt.*;
import javax.swing.*;

class MyDrawPanel2 extends JPanel
{
	public void paintComponent(Graphics g)
	{
		g.setColor(Color.orange);
		g.fillOval(20, 50, 100, 100);
	}

}


public class DrawRect
{
	public static void main(String[] args)
	{
		MyDrawPanel2 draw = new MyDrawPanel2();
		JFrame frame = new JFrame();
		frame.getContentPane().add(BorderLayout.CENTER, draw);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
}