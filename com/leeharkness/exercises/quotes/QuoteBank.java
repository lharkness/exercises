package com.leeharkness.exercises.quotes;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.leeharkness.exercises.quotes.dao.QuoteDBDao;

/**
 * Displays quotes found in the quote DB
 */
public class QuoteBank {
	
	private final String quotePath =
		"/Users/amzrobe/eclipse-workspace/ExercisesForProgrammers/"
		+ "src/com/leeharkness/exercises/quotes/resources/quotes.txt";
			
	private Map<String, String> quoteBank;
	
	private final QuoteFormatter quoteFormatter = new QuoteFormatter();
	
	public static void main(String[] args) {
		QuoteBank app = new QuoteBank();
		app.run();
	}
	
	/**
	 * Outputs the quotes found in the DB
	 */
	private void run() {
		quoteBank = loadQuotes();
		quoteBank.entrySet().stream()
			.map(e -> quoteFormatter.format(e.getKey(), e.getValue()))
			.forEach(l -> System.out.println(l));
	}

	/**
	 * Loads the quotes from the DB
	 */
	private Map<String, String> loadQuotes() {
		final QuoteDBDao quoteDBDao = new QuoteDBDao(quotePath);
						
		Map<String, String> retMap = new HashMap<>();
		try {
			retMap = quoteDBDao.retrieveQuotes();
		} catch (final IOException ioe) {
			ioe.printStackTrace();
		}
		
		return retMap;
	}
	
}
