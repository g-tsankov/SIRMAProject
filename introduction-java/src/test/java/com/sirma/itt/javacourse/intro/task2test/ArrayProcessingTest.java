package com.sirma.itt.javacourse.intro.task2test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.sirma.itt.javacourse.intro.task2.ArrayProcessing;

/*
 * ArrayProcessingTest is a test class, testing different input arrays.

 */

public class ArrayProcessingTest {
	@Test
	public void standartTest() {
		ArrayProcessing processing = new ArrayProcessing();
		int[] arrayInput = { 1, 5, 7, 8, 4, 5, 8, 3, 6, 9, 23, -34 };
		int actualResult = processing.getMinElement(arrayInput);
		int expectedResult = 12;
		assertEquals(expectedResult, actualResult);
	}

	/*
	 * Tests for an invalid input array in getMinElement method
	 */
	@Test(expected = NullPointerException.class)
	public void invalidInput() {
		int[] emptyArray = null;
		ArrayProcessing processing = new ArrayProcessing();
		processing.getMinElement(emptyArray);
	}

	/* test the sum method if it works correctly */
	@Test
	public void sumMethod() {
		ArrayProcessing processing = new ArrayProcessing();
		int[] testArray = { 1, 6, 7, 9, 3, 5, 8, 0, 3, 6 };
		int actualResult = processing.sum(testArray);
		int expectedResult = 48;
		assertEquals(expectedResult, actualResult);
	}

	/* test for null array in sum Method */
	@Test(expected = NullPointerException.class)
	public void nullArray() {
		ArrayProcessing processing = new ArrayProcessing();
		int[] emptyArray = null;
		processing.sum(emptyArray);
	}

	/* test for initialized, empty array in sum method */
	@Test(expected = NullPointerException.class)
	public void sumNullTest() {
		ArrayProcessing processing = new ArrayProcessing();
		int[] emptyArray = new int[0];
		processing.sum(emptyArray);
	}

	/* Testing for null array in print method */
	@Test(expected = NullPointerException.class)
	public void printNullTest() {
		ArrayProcessing processing = new ArrayProcessing();
		int[] testArray = null;
		processing.print(testArray);
	}

	/* testing for empty array in print method */
	@Test(expected = IllegalArgumentException.class)
	public void printEmptyTest() {
		ArrayProcessing processing = new ArrayProcessing();
		int[] testArray = new int[0];
		processing.print(testArray);
	}
}
