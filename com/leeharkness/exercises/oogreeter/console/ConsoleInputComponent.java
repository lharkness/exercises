package com.leeharkness.exercises.oogreeter.console;

import java.util.Scanner;

import com.leeharkness.exercises.oogreeter.greeterfactory.InputComponent;

/**
 * Console implementation of the InputComponent interface
 */
public class ConsoleInputComponent implements InputComponent {

	/**
	 * Uses Standard Input and Output to get user input
	 */
	@Override
	public String getInput(String prompt) {
		System.out.print(prompt);
		try (Scanner input = new Scanner(System.in)) {
			return input.nextLine();
		}
	}

}
