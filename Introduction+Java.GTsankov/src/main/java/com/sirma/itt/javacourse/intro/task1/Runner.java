package com.sirma.itt.javacourse.intro.task1;

import java.util.Scanner;

import org.slf4j.LoggerFactory;

/**
 * The Runner class, where the main method is kept.
 * 
 * @author Georgi Tsankov
 */
final class Runner {
	/**
	 * Prevent instantiation.
	 */
	private Runner() {
	};

	private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(Runner.class);
	private static int firstVariable;
	private static int secondVariable;
	private static Scanner scanner = new Scanner(System.in);

	/**
	 * The main method of the program. It scans for user input and passes the
	 * input variables in GreatestCommonDivisor.After the calculations, the
	 * result is turned into String and outputted to the console using the
	 * LOGGER.
	 * 
	 * @param args
	 *            -not used in this code
	 */
	public static void main(String[] args) {
		/**
		 * There needs to be a check if the input numbers are integers or not
		 * before doing any other work.Two loops are added to check if both
		 * variable inputs are integers and secondVariable is not 0.
		 */
		while (true) {
			LOGGER.info("Enter the first variable:");
			String input = scanner.next();
			try {
				firstVariable = Integer.parseInt(input);
				break;
			} catch (NumberFormatException ne) {
				LOGGER.info("Input is not a number.");
			}
		}
		while (true) {
			LOGGER.info("Enter the second variable:");
			String input = scanner.next();
			try {

				secondVariable = Integer.parseInt(input);
				if (secondVariable == 0) {
					throw new IllegalArgumentException();
				}
				break;
			} catch (NumberFormatException ne) {
				LOGGER.info("Input is not a number.");
			} catch (IllegalArgumentException e) {
				LOGGER.info("You can't divide by 0!");
			}
		}

		GreatestCommonDivisor gcd = new GreatestCommonDivisor();
		int result = gcd.calculate(firstVariable, secondVariable);

		LOGGER.info("The Greatest Common Divisor between " + firstVariable + " and " + secondVariable + " is: "
				+ result);

		/**
		 * Proceeding with task 1-b), finding the Least Common Multiple of the
		 * two integers, we need to divide the product of both integers by their
		 * Greatest Common Divisor.
		 */
		int leastCommonDivisor = (firstVariable * secondVariable) / result;
		LOGGER.info("The Least Common Divisor between " + firstVariable + " and " + secondVariable + " is:"
				+ leastCommonDivisor);

	}
}