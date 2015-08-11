/**
 * 
 */
package com.sirma.itt.javacourse.intro.task8;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Georgi Tsankov
 *
 */
public class RunHangman {
	private static final Logger LOGGER = LoggerFactory.getLogger(RunHangman.class);
	private static String hangWord;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		runHangman();

	}

	public static void runHangman() {
		Hangman hang = new Hangman();
		Scanner scanner = new Scanner(System.in);
		LOGGER.info("Please input a word to play:");
		hangWord = scanner.nextLine();
		setWord(hang);

	}

	public static void setWord(HangInterface hangInterface) {
		hangInterface.startGame(hangWord);
	}
}
