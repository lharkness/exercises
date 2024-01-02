package com.leeharkness.exercises.nonvariablegreeter;

import java.util.Scanner;

public class NonVariableGreeter {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.print("Please enter your name: ");
		System.out.println(String.format("Hello %s, nice to meet you!", 
				new Scanner(System.in).nextLine()));
	}

}
