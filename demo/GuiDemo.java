/*
 * GUI is not required by APCSA but interesting and good to know.
 * Swing is the most popular API for Desktop GUI in Java.
 */

import javax.swing.*;
import java.util.*;

class GuiDemo
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("GUI demo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,300);
		JButton button = new JButton("Hello GUI");
		frame.getContentPane().add(button);

		frame.setVisible(true);
	}
}
