package com.sirma.itt.javacourse.intro.task2;

import org.slf4j.LoggerFactory;

/**
 * Class realising methods connected with array processing.
 * 
 * @author George
 */
public class ArrayProcessing {

	private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(ArrayProcessing.class);

	/**
	 * Returns the index of the element with minimum value.
	 * 
	 * @param array
	 *            passed by main
	 * @return the index of the element(starting from 1)
	 */
	public int getMinElement(int[] array) {

		/* checking for empty array */
		if (array == null || array.length == 0) {
			LOGGER.info("Array is empty or null");
			throw new NullPointerException("bad array");
		}
		int index = 0;
		int minValue = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] < minValue) {
				minValue = array[i];
				index = i;
			}
		}
		return index + 1;
	}

	/**
	 * Returns the sum of all elements in the array.
	 * 
	 * @param array
	 *            array passed by main
	 * @return sum of the array elements.
	 */
	public int sum(int[] array) {
		if (array == null || array.length == 0) {
			throw new NullPointerException("Entered a NULL array.");
		}
		int sum = 0;
		for (int i = 0; i <= (array.length - 1); i++) {
			sum = sum + array[i];
		}
		return sum;
	}

	/**
	 * Prints the array's elements to screen.
	 * 
	 * @param array
	 *            array passed by main
	 * @return a String set of the array elements.
	 */
	public String print(int[] array) {
		if (array == null) {
			throw new NullPointerException("Entered a NULL array.");
		}
		if (array.length == 0) {
			throw new StringIndexOutOfBoundsException("Can't print out an empty array");
		}
		String message = null;
		StringBuilder messageBuild = new StringBuilder();
		LOGGER.info("The elements of the array are: ");
		for (int i = 0; i <= (array.length - 1); i++) {
			messageBuild.append(array[i] + ",");
		}

		/* its -1, because the last comma should be skipped. */

		messageBuild.setLength(messageBuild.length() - 1);
		message = messageBuild.toString();
		return message;
	}

}
