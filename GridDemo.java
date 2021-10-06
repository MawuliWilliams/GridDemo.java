/// Demonatration of the Grid layout

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GridDemo
{ 
	public static void main(String[] args)
	{
		//create the JFrame object and customize it
		JFrame myFrame = new JFrame("Grid Layout Demo");
		myFrame.setBounds(600, 240, 500, 120);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// use Grid Layout as the layout manager for myFrame
		myFrame.setLayout(new GridLayout(3, 2));
		myFrame.setVisible(true);

		//create multiple JButton objects
		JButton button1 = new Jbutton("Button 1");
        JButton button2 = new Jbutton("Button 2");
        JButton button3 = new Jbutton("Button 3");
        JButton button4 = new Jbutton("Button 4");
        JButton button5 = new Jbutton("Button 5");
        JButton button6 = new Jbutton("Button 6");

        // add the JButtons to the frame
        myFrame.add(button1);
        myFrame.add(button4);
        myFrame.add(button2);
        myFrame.add(button5);
        myFrame.add(button3);
        myFrame.add(button6);
    {
}