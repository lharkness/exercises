package com.leeharkness.exercises.madlibs;

import java.util.Scanner;

/**
 * This is a brute-force, simple implementation of the mad libs exercise
 * it implements the exercise exactly as written
 */
public class SimpleMadLibs {
	
	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String noun = getUserInput("Please enter a noun: ");
		String verb = getUserInput("Please enter a verb: ");
		String adjective = getUserInput("Please enter an adjective: ");
		String adverb = getUserInput("Please enter an adverb: ");
		
		input.close();
		
		String finishedStory = String.format("Do you %s your %s %s %s? \nThat's hilarious!", 
				verb, adjective, noun, adverb);
		
		System.out.println("\n" + finishedStory);
			
	}
	
	private static String getUserInput(String prompt) {
		String retVal = null;
		do {
			System.out.print(prompt);
			retVal = input.nextLine();
		} while (retVal == null || retVal.length() == 0);
		
		return retVal;
	}

}
