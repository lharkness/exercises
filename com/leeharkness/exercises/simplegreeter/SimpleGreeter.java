package com.leeharkness.exercises.simplegreeter;

import java.util.Scanner;

public class SimpleGreeter {
	public static void main(String[] args) {
		String name = getName();
		String message = buildMessageFrom(name);
		outputMessage(message);
	}
	
	private static String getName() {
		System.out.print("Please enter your name: ");
		try (Scanner input = new Scanner(System.in)) {
			return input.nextLine();
		}
	}
	
	private static String buildMessageFrom(String name) {
		return "Hello, " + name + " nice to meet you!";
	}
	
	private static void outputMessage(String message) {
		System.out.println(message);
	}

}
