package com.leeharkness.exercises.charcounter;

import java.util.Scanner;

public class SimpleCharCounter {
	
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			String line = "";
			do {
				System.out.print("What is the input string? ");
				line = input.nextLine();
			} while (line == null || line.length() == 0);
			System.out.println(String.format("%s has %d characters.", line, line.length()));
		}
	}
}
