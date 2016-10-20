//this program has three errors


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class CheckBoxList
{
	JCheckBox check;
	JList<String> list;

	public static void main(String[] args)
	{
		CheckBoxList gui = new CheckBoxList();
		gui.go();
	}

	public void go()
	{
		String[] listEntries = {"alpha", "beta", "gamma", "delta", "epsilon", "zeta", "eta", "theta"};

		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.setSize(300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		JScrollPane scroller = new JScrollPane(list);
		scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		panel.add(scroller);

		list = new JList<String>(listEntries);
		list.setVisibleRowCount(4);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.addListSelectionListener(new ListTest());

		check = new JCheckBox("Goes to 11");
		check.addItemListener(new CheckBox());
		check.setSelected(false);

		panel.add(check);
		panel.add(list);
		frame.getContentPane().add(BorderLayout.CENTER, panel);

	}


	class CheckBox implements ItemListener
	{
		public void itemStateChanged(ItemEvent e)
		{
			String onOrOff = "off";
			if (check.isSelected())
				onOrOff = "on";
			System.out.println("Checkbox is "+ onOrOff);
		}
	}


	class ListTest implements ListSelectionListener
	{
		public void valueChanged(ListSelectionEvent lse)
		{
			if (!lse.getValueIsAdjusting())
			{
				String selection = list.getSelectedValue();
				System.out.println(selection);
			}
		}
	}

	
}