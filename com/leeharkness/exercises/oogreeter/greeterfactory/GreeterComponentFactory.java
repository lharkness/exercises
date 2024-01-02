package com.leeharkness.exercises.oogreeter.greeterfactory;

import com.leeharkness.exercises.oogreeter.console.ConsoleGreeterComponentFactory;
import com.leeharkness.exercises.oogreeter.swing.GuiGreeterComponentFactory;

/**
 * Defines the GreeterComponentFactory and has a factory method for creating GreeterComponentFactories
 */
public interface GreeterComponentFactory {
	// NOTE: these components could probably be modeled better as Functions
	InputComponent getInputComponent();
	MessageBuildingComponent getMessageBuildingComponent();
	OutputComponent getOutputComponent();
	

	/**
	 * Creates a GreeterComponentFactory
	 * @param greeterType the type of GreeterComponentFactory to create
	 */
	static GreeterComponentFactory create(GreeterType greeterType) {
		switch (greeterType) {
			case CONSOLE:
				return new ConsoleGreeterComponentFactory();
			case GUI:
				return new GuiGreeterComponentFactory();
			default:
				throw new IllegalArgumentException("Unknown Greeter Factory Type: " + greeterType);
		}
			
	}

}
