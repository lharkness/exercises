package com.leeharkness.exercises.charcounter.gui;

import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * There are likely all sorts of better OO designs for this stuff...
 */
public class CharCounterGui extends JFrame {

	private static final long serialVersionUID = 1L;
	
	JLabel textLabel = new JLabel("What is the input string?");
	JLabel lengthLabel = new JLabel();
	JTextField textField = new JTextField(40);
	
	public CharCounterGui() {
		super("Character Counter");
		setLayout(new FlowLayout());
		add(textLabel);
		add(textField);
		add(lengthLabel);
		
		/**
		 * Update the length field every time the user releases a key
		 */
		textField.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent event) {
				lengthLabel.setText(Integer.toString(
						textField.getText().length()));
			}
		});
		
		setSize(800, 100);		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);		
		setVisible(true);
	}
	
}
