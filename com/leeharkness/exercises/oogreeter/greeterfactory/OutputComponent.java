package com.leeharkness.exercises.oogreeter.greeterfactory;

/**
 * represents a component to output a message
 */
public interface OutputComponent {
	/**
	 * Outputs a message
	 * @param message the message to output
	 */
	void outputMessage(String message);
}
