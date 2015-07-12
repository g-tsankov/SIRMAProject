package com.sirma.itt.javacourse.intro.task3;

import org.slf4j.LoggerFactory;

/**
 * Runner class for task 3, finding the median of a unsorted array.
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

	/**
	 * Main method for the runner.
	 * 
	 * @param args
	 *            not used
	 */
	public static void main(String[] args) {

		int[] arrayInput = { 2, 51, 5, 7, 8, 4, 78, 4, 5, 3, 7, 8, 3, 4, 34 };

		FindMedian findMedian = new FindMedian();
		int medianIndex = findMedian.findMedian(arrayInput);
		String medianString = Integer.toString(medianIndex);
		LOGGER.info("The Median value of the array is: " + medianString);
	}

}
