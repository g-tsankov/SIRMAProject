package com.sirma.itt.javacourse.intro.task5;

import java.util.Arrays;

import org.slf4j.LoggerFactory;

/**
 * Runner class for the ArrayReverse class.
 * 
 * @author George
 */
public class Runner {

	private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(Runner.class);

	public static void main(String[] args) {

		int[] array = { 2, 5, 7, 843, 2, 6, 3, 7, 52, 3, 54, 6, 734, 543, 214 };
		ArrayReverse reverse = new ArrayReverse();
		LOGGER.info("Original array: " + Arrays.toString(array));
		int[] array2 = reverse.reverseArrayVer2(array);
		String reversedArray = Arrays.toString(array2);
		LOGGER.info("Reverse using method one: " + reversedArray);

		/* reset the array and use the second method */

		int[] array3 = reverse.reverseArray(array);
		reversedArray = Arrays.toString(array3);
		LOGGER.info("Reverse using method two: " + reversedArray);

	}

}
