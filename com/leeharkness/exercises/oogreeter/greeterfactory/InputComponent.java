package com.leeharkness.exercises.oogreeter.greeterfactory;

/**
 * Defines and input component
 */
public interface InputComponent {
	/**
	 * Retrieves input
	 * @param prompt What to prompt with
	 * @return the input
	 */
	String getInput(String prompt);
}
