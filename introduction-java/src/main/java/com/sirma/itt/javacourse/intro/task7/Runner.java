package com.sirma.itt.javacourse.intro.task7;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Runner class for RandomStringGen.
 * 
 * @author George
 */
public final class Runner {
	private Runner() {

	}

	private static final Logger LOGGER = LoggerFactory.getLogger(Runner.class);
	private static int capitalLetters;
	private static int smallLetters;
	private static int digits;
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		RandomStringGen generate = new RandomStringGen();

		LOGGER.info("Enter number of Capital Letters:");
		try {
			capitalLetters = scanner.nextInt();
		} catch (InputMismatchException ne) {
			LOGGER.info("Input is not a number.");
		}

		try {
			LOGGER.info("Enter number of Small Letters:");
			smallLetters = scanner.nextInt();
		} catch (InputMismatchException ne) {
			LOGGER.info("Input is not a number");
		}
		try {
			LOGGER.info("Enter number of digits:");
			digits = scanner.nextInt();
		} catch (InputMismatchException ne) {
			LOGGER.info("Input is not a number");
		}

		String randomWord = generate.generate(capitalLetters, smallLetters, digits);

		LOGGER.info("The random string is:" + randomWord);

	}

}
