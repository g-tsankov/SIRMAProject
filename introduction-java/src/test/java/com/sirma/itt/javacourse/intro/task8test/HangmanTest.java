package com.sirma.itt.javacourse.intro.task8test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.junit.Test;

import com.sirma.itt.javacourse.intro.task8.Hangman;

public class HangmanTest {

	// coverage of the class
	@Test
	public void coverageRun() {

		Hangman hangMan = new Hangman();
		StringBuilder dashes = new StringBuilder("------");
		StringBuilder noDashes = new StringBuilder("asdfgh");

		hangMan.cleanScreen();
		hangMan.checkForDashes(dashes);
		hangMan.checkForDashes(noDashes);

	}

	// testing out the makeDashes method
	@Test
	public void makeDashesTest() {
		Hangman hangMan = new Hangman();
		StringBuilder expectedString = new StringBuilder("------");
		StringBuilder actualString = new StringBuilder();
		actualString = hangMan.makeDashes(actualString, expectedString.length());
		assertTrue(expectedString.toString().equals(actualString.toString()));
	}

	// Word deliberately tested with uppercase letter

	@Test
	public void upperCaseTest() {
		Hangman hangMan = new Hangman();
		ByteArrayInputStream in = new ByteArrayInputStream("avadakedabra".getBytes());
		System.setIn(in);
		hangMan.startGame("AvadAkedaBra");
		assertTrue(hangMan.isGuessed());
		System.setIn(System.in);
	}

	/**
	 * Test to check if user inputs havent guessed the word. errorCount is set
	 * to 5 so nextLine will break the game.
	 */
	@Test
	public void testWrong() {
		Hangman hangMan = new Hangman();
		String simulatedUserInput = "c";
		hangMan.setErrorCount(5);
		InputStream savedStandardInputStream = System.in;

		System.setIn(new ByteArrayInputStream(simulatedUserInput.getBytes()));
		hangMan.startGame("AvadAkedaBra");

		assertFalse(hangMan.isGuessed());
		System.setIn(savedStandardInputStream);
	}

	/**
	 * test for checkSuggestion for one character
	 */
	@Test
	public void checkSuggestionTest() {
		Hangman hangMan = new Hangman();
		StringBuilder dashes = new StringBuilder("-");
		StringBuilder actualResult = hangMan.checkSuggestion("a", "a", dashes);
		StringBuilder expectedResult = new StringBuilder("a");
		assertTrue(expectedResult.toString().equals(actualResult.toString()));
	}
}
