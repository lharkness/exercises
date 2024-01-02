package com.leeharkness.exercises.oogreeter;

import com.leeharkness.exercises.oogreeter.greeterfactory.GreeterComponentFactory;
import com.leeharkness.exercises.oogreeter.greeterfactory.GreeterType;

/**
 * Used to demonstrate the abstract factory pattern to get components to greet the user.
 */
public class Main {
	
	/**
	 * Main program entry point
	 */
	public static void main(String[] args) {
		GreeterComponentFactory greeterComponentFactory = 
				GreeterComponentFactory.create(GreeterType.GUI);
		
		String name = 
				greeterComponentFactory
				.getInputComponent()
				.getInput("Please enter your name: ");
		String message = greeterComponentFactory.getMessageBuildingComponent()
				.buildMessageFrom("Hello %s, nice to meet you!", name);
		
		greeterComponentFactory.getOutputComponent().outputMessage(message);
	}

}
