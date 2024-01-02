package com.leeharkness.exercises.quotes;

import java.util.Scanner;

/**
 * Straight-forward implementation of the quote exercise.  Prompts for a quote
 * and an author, then displays the quote formatted as author says "quote"
 */
public class SimpleQuoter {
	public static void main(String[] args) {
		
		final QuoteFormatter quoteFormatter = new QuoteFormatter();
		
		try (final Scanner input = new Scanner(System.in)) {
			System.out.print("What is the quote?" );
			final String quote = input.nextLine();
			System.out.print("Who said it?");
			final String author = input.nextLine();
			
			System.out.println(quoteFormatter.format(author, quote));
		}
		
	}
}
