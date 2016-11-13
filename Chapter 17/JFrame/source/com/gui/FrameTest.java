package com.gui;

import javax.swing.*;

public class FrameTest
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Window");
		frame.setSize(300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}