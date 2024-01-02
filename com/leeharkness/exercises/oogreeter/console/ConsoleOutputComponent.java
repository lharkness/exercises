package com.leeharkness.exercises.oogreeter.console;

import com.leeharkness.exercises.oogreeter.greeterfactory.OutputComponent;

/**
 * Console implementation of the OutputComponent interface
 */
public class ConsoleOutputComponent implements OutputComponent {

	/**
	 * Uses the console to output the messages
	 */
	@Override
	public void outputMessage(String message) {
		System.out.println(message);
	}

}
