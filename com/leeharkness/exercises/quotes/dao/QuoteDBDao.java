package com.leeharkness.exercises.quotes.dao;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * responsible for access to the Quote DB.  The format for the quoteDB is:
 * author:quote
 */
public class QuoteDBDao {
	
	private final String pathToDb;
	
	/**
	 * Initialization ctor - needs the path to the Quote DB
	 * @param path the path to the QuoteDB
	 */
	public QuoteDBDao(final String path) {
		this.pathToDb = path;
	}
	
	/**
	 * Retrieves the quotes found in the quote DB
	 */
	public Map<String, String> retrieveQuotes() throws IOException {
		
		List<String> lines = 
				Files.readAllLines(Path.of(pathToDb), StandardCharsets.UTF_8);
		
		return lines.stream()
				.map(l -> new LineEntry(l))
				.collect(Collectors.toMap(e -> e.key, e -> e.value));
		
	}
	
	/**
	 * Represents the author/quote pair found in the quotes DB
	 */
	private static class LineEntry {
		String key;
		String value;
		
		public LineEntry(String line) {
			String[] parts = line.split(":");
			this.key = parts[0];
			this.value = parts[1];
		}
	}
	
}
