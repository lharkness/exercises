package com.leeharkness.exercises.oogreeter.console;

import com.leeharkness.exercises.oogreeter.greeterfactory.AppendingMessageBuildingComponent;
import com.leeharkness.exercises.oogreeter.greeterfactory.GreeterComponentFactory;
import com.leeharkness.exercises.oogreeter.greeterfactory.InputComponent;
import com.leeharkness.exercises.oogreeter.greeterfactory.MessageBuildingComponent;
import com.leeharkness.exercises.oogreeter.greeterfactory.OutputComponent;

/**
 * GreeterComponentFactory implementation which uses Console input and output
 */
public class ConsoleGreeterComponentFactory implements GreeterComponentFactory {

	/**
	 * Returns a Console input Component
	 */
	@Override
	public InputComponent getInputComponent() {
		return new ConsoleInputComponent();
	}

	/**
	 * Returns a simple appending message component
	 */
	@Override
	public MessageBuildingComponent getMessageBuildingComponent() {
		return new AppendingMessageBuildingComponent();
	}

	/**
	 * Returns a Console output Components
	 */
	@Override
	public OutputComponent getOutputComponent() {
		return new ConsoleOutputComponent();
	}

}
