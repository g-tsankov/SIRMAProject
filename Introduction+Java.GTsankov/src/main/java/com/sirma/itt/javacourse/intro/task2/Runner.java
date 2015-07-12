package com.sirma.itt.javacourse.intro.task2;

import org.slf4j.LoggerFactory;

/**
 * Contains the main method of Task 2. A static array is created and the methods
 * of ArrayProcessing.java are called using this array
 * 
 * 
 * @author George
 */
final class Runner {
	/**
	 * Prevent instantiation.
	 */
	private Runner() {
	}

	private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(Runner.class);
	private static int min;
	private static int sum;
	private static String message;

	/**
	 * Main method for the task. The array is created and initialized in main.
	 * 
	 * @param args
	 *            not used
	 */
	public static void main(String[] args) {
		int[] array = { 1, 2, 87, 7, 9, 5, 0, 57, 8 };

		ArrayProcessing processing = new ArrayProcessing();
		min = processing.getMinElement(array);
		LOGGER.info("The minimum element in the array is in position:" + min);
		sum = processing.sum(array);
		LOGGER.info("The sum of the array elements is: " + sum);
		message = processing.print(array);

		LOGGER.info(message);

	}
}
