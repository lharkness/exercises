package com.leeharkness.exercises.oogreeter.swing;


import javax.swing.JLabel;

import com.leeharkness.exercises.oogreeter.greeterfactory.OutputComponent;

public class GuiOutputComponent implements OutputComponent {
	
	private final JLabel lblText;
	
	public GuiOutputComponent(JLabel lblText) {
		this.lblText = lblText;
	}

	@Override
	public void outputMessage(String message) {
		lblText.setText(message);
	}

}
