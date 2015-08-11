package com.sirma.itt.javacourse.intro.task8;

import java.awt.AWTException;

/**
 * Interface utilizing Hangman methods.
 * 
 * @author George
 */
public interface HangInterface {

	public void startGame(String hangWord);

	/**
	 * Main method for the Hangman class.
	 * 
	 * @param hangWord
	 *            word that is inputted by the user.
	 */
	void play();

	/**
	 * Creates a new StringBuilder with the length of the word is searched,
	 * filled with dashes.
	 * 
	 * @param dashes
	 *            the StringBuilder.
	 * @param length
	 *            Length of searched word.
	 * @return a StringBuilder with dashes.
	 */
	StringBuilder makeDashes(StringBuilder dashes, int length);

	/**
	 * Method used to clear the screen, when the user inputs the new word.
	 * 
	 * @throws AWTException
	 */
	void cleanScreen();

	/**
	 * Method checking every suggestion the user makes.
	 * 
	 * @param suggestion
	 *            string of the suggestion the user made
	 * @param word
	 *            actual word
	 * @param dashes
	 *            StringBuilder with dashes
	 * @return modified StringBuilder dashes, depending on whether the user got
	 *         the suggestion right or not.
	 */
	StringBuilder checkSuggestion(String suggestion, String word, StringBuilder dashes);

	/**
	 * Method for showing the current standings in the game (how much has the
	 * user guessed correctly, incorrectly etc.).
	 * 
	 * @param dashes
	 *            dashes StringBuilder
	 * @param errorCount
	 *            variable counting every wrong entry
	 */
	void showCurrentInfo(StringBuilder dashes, int errorCount);

	/**
	 * Method, checking whether the word is guessed or not.
	 * 
	 * @param dashes
	 *            dashes StringBuilder
	 * @return whether the word is guessed or not.
	 */
	boolean checkForDashes(StringBuilder dashes);
}
