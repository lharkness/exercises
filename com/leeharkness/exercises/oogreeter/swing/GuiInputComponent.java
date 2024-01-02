package com.leeharkness.exercises.oogreeter.swing;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.leeharkness.exercises.oogreeter.greeterfactory.InputComponent;

public class GuiInputComponent implements InputComponent {

	private final JFrame myFrame;
	
	public GuiInputComponent(JFrame theFrame) {
		this.myFrame = theFrame;
	}
	
	
	@Override
	public String getInput(String prompt) {
		myFrame.pack();
		myFrame.setVisible(true);
		return JOptionPane.showInputDialog("Please enter your name");
	}

}
