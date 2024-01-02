package com.leeharkness.exercises.oogreeter.greeterfactory;

/**
 * Represents a component to build a message
 */
public interface MessageBuildingComponent {
	/**
	 * Builds a message
	 * @param messageToFormat The message
	 * @param input the data to put into the message
	 * @return The constructed message
	 */
	String buildMessageFrom(String messageToFormat, String input);
}
