package com.leeharkness.exercises.oogreeter.greeterfactory;

/**
 * Implementation of the MessageBuildingComponent which uses String.format to construct the message
 */
public class AppendingMessageBuildingComponent implements MessageBuildingComponent {


	/**
	 * Inserts the input parameter into the messageToFormat parameter.  messageToFormat needs
	 * to contain exactly one %s substitution parameter
	 */
	@Override
	public String buildMessageFrom(String messageToFormat, String input) {
		return String.format(messageToFormat, input);
	}

}
