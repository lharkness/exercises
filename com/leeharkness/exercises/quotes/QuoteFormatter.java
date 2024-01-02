package com.leeharkness.exercises.quotes;

/**
 * Responsible for formatting the quote data (author, quote)
 */
public class QuoteFormatter {
	
	public String format(final String author, final String quote) {
		return String.format("%s says, \"%s\"", author, quote);
	}

}
