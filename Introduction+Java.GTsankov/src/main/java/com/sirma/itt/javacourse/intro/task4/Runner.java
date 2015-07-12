package com.sirma.itt.javacourse.intro.task4;

import java.util.Arrays;

import org.slf4j.LoggerFactory;

/**
 * Runner class for the QuickSort class.
 * 
 * @author George
 */
public final class Runner {

	/**
	 * Prevents instatiation.
	 */
	private Runner() {

	}

	private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(Runner.class);
	private static int[] array = { 2, 6, 87, 5, 3, 5, 3245, 754, 345, 75, 3245, 745, 346, 745, 84 };

	/**
	 * Main method for the QuickSort class.
	 * 
	 * @param args
	 *            none used.
	 */
	public static void main(String[] args) {

		QuickSort qs = new QuickSort();
		qs.quickSort(array, 0, array.length - 1);
		String arrayElements = new String(Arrays.toString(array));
		LOGGER.info(arrayElements);
	}

}
