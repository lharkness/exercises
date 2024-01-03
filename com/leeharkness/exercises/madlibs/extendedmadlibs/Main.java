package com.leeharkness.exercises.madlibs.extendedmadlibs;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Will read in a story template, prompt the user for inputs for
 * each item there and output the story
 */
public class Main {
	
	private static final String FILE_NAME = 
			"C:\\Users\\lhark\\exercises\\com\\leeharkness\\"
			+ "exercises\\madlibs\\extendedmadlibs\\resources\\simpleTemplate.tmpl";
	
	private static final Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException {
		String template = readTemplateFrom(FILE_NAME);
		List<String> userInputs = getInputFromUserFor(template);
		input.close();

		String story = createStoryFrom(template, userInputs);
		
		System.out.println(story);
	}

	/**
	 * Creates a full story from the template and the user inputs
	 */
	private static String createStoryFrom(String template, List<String> userInputs) {
		StringBuilder sb = new StringBuilder();
		int index = 0;
		int curPos = 0;
		
		// Go through the story template, replacing each "blank" with the user input
		while (curPos < template.length() && (curPos >= 0) && index < userInputs.size()) {
			int nextTokenPos = template.indexOf(':', curPos);
			// If we can't find another "blank", exit the loop
			if (nextTokenPos < 0) {
				break;
			}
			else {
				// Add the current text, up to but not including the placeholder, 
				// to the output - then add the user input
				sb.append(template.substring(curPos, nextTokenPos));
				sb.append(userInputs.get(index));
				index++;
				// step past the placeholder
				curPos = template.indexOf(" ", nextTokenPos);
			}
		}
		// If there's anything left to add, add it
		if (curPos < template.length()) {
			sb.append(template.substring(curPos));
		}
		
		return sb.toString();
	}

	/**
	 * get user input for each placeholder in the story template
	 */
	private static List<String> getInputFromUserFor(String template) {
		// I am certain that there is a very clever and compact regex to do this
		// but I don't like regex
		List<String> retList = new ArrayList<>();
		int curPos = 1;
		// Go get the first bit of replacement text.
		String replacementText = getReplacementTextFrom(template, curPos);
		do {
			// Yank out the part of speech from the placeholder text
			String partOfSpeech = getPartOfSpeechFrom(replacementText);
			// And ask the user to enter a value with that part of speech
			retList.add(getUserInputFor("Please enter a " + partOfSpeech + ": "));
			// Increase our current position past the colon of the replacement text
			curPos++;
			replacementText = getReplacementTextFrom(template, curPos);
		} while (replacementText != null && replacementText.length() > 0 && curPos < template.length());
			
		return retList;
	}

	/**
	 * Prompt the user for values for a given part of speech
	 */
	private static String getUserInputFor(String prompt) {
		String retVal = null;
		do {
			System.out.print(prompt);
			retVal = input.nextLine();
		} while (retVal == null || retVal.length() == 0);
		
		return retVal;
	}

	/**
	 * Extracts the part of speech from the placeholder text
	 */
	private static String getPartOfSpeechFrom(String replacementText) {
		if (replacementText == null || (replacementText.length() == 0)) {
			return "";
		}
		return replacementText;
	}

	/**
	 * Gets the i'th placeholder text
	 * It's almost certainly more efficient to return an iterator or 
	 * at least a position to search from - as is this thing starts from 0
	 * every time
	 */
	private static String getReplacementTextFrom(String template, int i) {
		String retString = "";
		int curReplacementTextNum = 0;
		int curPos = 0;
		while (curReplacementTextNum < i) {
			curPos = template.indexOf(":", curPos);
			if (curPos < 0) {
				return retString;
			}
			curReplacementTextNum++;
			curPos++;
			if (curReplacementTextNum == i) {
				return template.substring(curPos, template.indexOf(" ", curPos));
			}
		}
		return "";
	}

	/**
	 * Reads in the template
	 */
	private static String readTemplateFrom(String fileName) throws IOException {
		List<String> lines = 
				Files.readAllLines(Path.of(fileName), StandardCharsets.UTF_8);
		StringBuilder sb = new StringBuilder();
		lines.stream().forEach(l -> sb.append(l + "\n"));
		return sb.toString();
	}

}
