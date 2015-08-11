package com.sirma.itt.javacourse.intro.task8;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Class utilizing methods for playing the Hangman game.
 * 
 * @author Georgi Tsankov
 *
 */
public class Hangman implements HangInterface {

	private static final Logger LOGGER = LoggerFactory.getLogger(Hangman.class);
	private StringBuilder dashes = new StringBuilder();
	private int errorCount = 0;
	private StringBuilder errorArray = new StringBuilder();
	private String hangWord = new String();
	private boolean guessed = false;

	/**
	 * setter for the errorCount variable. used for JUnit testing
	 * 
	 * @param errorCount
	 */
	public void setErrorCount(int errorCount) {
		this.errorCount = errorCount;
	}

	public boolean isGuessed() {
		return guessed;
	}

/**
	 * Method for passing the word from the runner class to this class.
	 * {@java.lang.Override
	 * @inheritDoc}
	 */
	public void startGame(String hangWord) {
		this.hangWord = hangWord;
		play();
	}

/**
	 * Play method for the Hangman game. The game starts here by initializing 
	 * the word and dashes. Then the information is shown in the console and 
	 * after user input its checked by the other methods.
	 * 
	 *  {@java.lang.Override
	 * @inheritDoc}
	 */
	public void play() {

		String tempHangWord = hangWord.toLowerCase();
		dashes = makeDashes(dashes, tempHangWord.length());
		cleanScreen();

		while (!guessed) {
			if (errorCount == 6) {
				LOGGER.info("Sorry, there are no more tries left :( ");
				return;
			}
			showCurrentInfo(dashes, errorCount);
			String suggestion = processUserInput();
			dashes = checkSuggestion(suggestion, tempHangWord, dashes);
			guessed = checkForDashes(dashes);
		}
		LOGGER.info("Congrats you won! With only " + (6 - errorCount) + " tries left !!");
	}

/**
	 * Creates a new StringBuilder with the length of the word which is searched,
	 * filled with dashes.
	 * @param dashes StringBuiler, ready to be filled with dashes
	 * @param length the desired length of the StringBuilder(length of the hangWord).
	 *  {@java.lang.Override
	 * @inheritDoc}
	 * @return a sting builder with the lenght of the hangWord, but switched with dashes
	 */
	public StringBuilder makeDashes(StringBuilder dashes, int length) {

		for (int i = 0; i < length; i++) {
			dashes.append("-");
		}
		return dashes;
	}

/**
	 * Method for clearing the screen when the game begins. {@java.lang.Override
	 * @inheritDoc}
	 */
	public void cleanScreen() {
		for (int i = 0; i < 20; i++) {
			System.out.println();
		}
	}

	/**
	 * Method checking, if the suggestion the user made, is contained in the
	 * word that is searched. { @java.lang.Override
	 * 
	 * @param suggestion
	 *            - suggestion that the user made in the console
	 * @param word
	 *            hangWord that is the real answer
	 * @param dashes
	 *            the current state of the game
	 * @inheritDoc
	 * @return updated StringBuilder dashes, after checking the suggestion.
	 */
	public StringBuilder checkSuggestion(String suggestion, String word, StringBuilder dashes) {
		boolean found = false;
		if (suggestion.length() == 1) {
			for (int i = 0; i < word.length(); i++) {
				if (suggestion.charAt(0) == word.charAt(i)) {
					dashes.setCharAt(i, suggestion.charAt(0));
					found = true;
				}
			}
		}
		if (suggestion.equals(word)) {
			StringBuilder result = new StringBuilder(word);
			return result;
		}

		if (!found) {
			LOGGER.info(suggestion + " is not contained in the word");
			errorArray.append(suggestion + " ");
			errorCount++;
		}

		return dashes;

	}

/**
	 * Method, showing the current standings (how much letters he has got right and how much tries he has left).
	 * @param dashes current state of the game
	 * @param errorCount number of failed tries
	 * {@java.lang.Override
	 * @inheritDoc}
	 */
	public void showCurrentInfo(StringBuilder dashes, int errorCount) {
		LOGGER.info("\n Current word:" + dashes);
		LOGGER.info("Tries left:" + (6 - errorCount));
		LOGGER.info("Letters that are wrongly guessed: " + errorArray);
		LOGGER.info("Input another letter:");
	}

/**
	 * Method, checking whether the word is guessed or not. If there are dashes left, the game continues.
	 * @param dashes current state of the game
	 *  {@java.lang.Override
	 * @inheritDoc}
	 *@return false- if the string contains dashes, true if it doesnt.
	 */
	public boolean checkForDashes(StringBuilder dashes) {
		String check = "-";
		for (int i = 0; i < dashes.length(); i++) {
			if (dashes.charAt(i) == check.charAt(0)) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Method for processing user input.
	 * 
	 * @return processed string
	 */
	public String processUserInput() {
		Scanner scanner = new Scanner(System.in);
		String suggestion = scanner.nextLine();
		suggestion = suggestion.toLowerCase();
		return suggestion;
	}

}
