package com.sirma.itt.javacourse.intro.task7;

import java.util.Random;

/**
 * Class used for generating random strings using a set of ASCII codes.
 * 
 * @author George
 */
public class RandomStringGen {

	private static final int[] CAPITAL_LETTERS = { 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81,
			82, 83, 84, 85, 86, 87, 88, 89, 90 };
	private static final int[] SMALL_LETTERS = { 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110,
			111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122 };
	private static final int[] DIGITS = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

	private static Random random = new Random();

	/**
	 * Method used for generation the random string.
	 * 
	 * @param capitalLetters
	 *            number of capital letters needed from the user
	 * @param smallLetters
	 *            number of capital letters needed from the user
	 * @param digits
	 *            number of digits needed from the user
	 * @return the random generated and shuffled string
	 */
	public String generate(int capitalLetters, int smallLetters, int digits) {

		StringBuilder generatedString = new StringBuilder();

		if (capitalLetters != 0) {
			for (int i = 0; i < capitalLetters; i++) {
				char capitalLetter = selectRand(CAPITAL_LETTERS);
				insert(generatedString, capitalLetter);
			}
		}

		if (smallLetters != 0) {
			for (int i = 0; i < smallLetters; i++) {
				char smallLetter = selectRand(SMALL_LETTERS);
				insert(generatedString, smallLetter);
			}
		}

		if (digits != 0) {
			for (int i = 0; i < digits; i++) {
				char digit = selectRand(DIGITS);
				insert(generatedString, digit);
			}
		}

		return shuffle(generatedString.toString());

	}

	/**
	 * Method for selecting a random ASCII code, and converting it to char.
	 * 
	 * @param charArray
	 *            the array of ASCII codes we are using
	 * @return the converted ASCII code.
	 */
	private static char selectRand(int[] charArray) {

		int selectedCode = charArray[random.nextInt(charArray.length)];
		char selected = (char) selectedCode;
		return selected;
	}

	/**
	 * MethodS for inserting the string in the StringBuilder.
	 * 
	 * @param generatedString
	 *            the random String thats is built in progress
	 * @param character
	 *            the character that will be inserted in the StringBuilder
	 */
	private static void insert(StringBuilder generatedString, char character) {
		generatedString.append(character);
	}

	/**
	 * Method for shuffling the already built String.
	 * 
	 * @param string
	 *            the previously generated string
	 * @return Shuffled String
	 */
	private static String shuffle(String string) {
		String tempString = string;
		String shuffledString = "";
		while (tempString.length() != 0) {
			int index = (int) Math.floor(Math.random() * tempString.length());
			char c = tempString.charAt(index);
			tempString = tempString.substring(0, index) + tempString.substring(index + 1);
			shuffledString += c;
		}
		return shuffledString;
	}
}