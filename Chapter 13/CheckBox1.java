import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class CheckBox1 implements ItemListener
{
	JCheckBox check;

	public static void main(String[] args)
	{
		CheckBox1 gui = new CheckBox1();
		gui.go();
	}

	public void go()
	{
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.setSize(300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		check = new JCheckBox("Goes to 11");
		check.addItemListener(this);
		check.setSelected(false);

		panel.add(check);
		frame.getContentPane().add(BorderLayout.CENTER, panel);

	}

	public void itemStateChanged(ItemEvent e)
	{
		String onOrOff = "off";
		if (check.isSelected())
			onOrOff = "on";
		System.out.println("Checkbox is "+ onOrOff);
	}

}