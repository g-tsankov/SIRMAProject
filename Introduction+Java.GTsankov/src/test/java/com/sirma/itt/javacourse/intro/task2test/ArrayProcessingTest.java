package com.sirma.itt.javacourse.intro.task2test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.sirma.itt.javacourse.intro.task2.ArrayProcessing;

/*
 * ArrayProcessingTest is a test class, testing different input arrays.

 */

public class ArrayProcessingTest {
	@Test
	public void test() {
		ArrayProcessing processing = new ArrayProcessing();
		int[] arrayInput = { 1, 5, 7, 8, 4, 5, 8, 3, 6, 9, 23, -34 };
		int actualResult = processing.getMinElement(arrayInput);
		int expectedResult = 12;
		assertEquals(expectedResult, actualResult);
	}

	/*
	 * Tests for an invalid input array
	 */
	@Test(expected = NullPointerException.class)
	public void test2() {
		int[] emptyArray = null;
		ArrayProcessing processing = new ArrayProcessing();
		processing.getMinElement(emptyArray);
	}

	/* test for empty array */
	@Test(expected = NullPointerException.class)
	public void test3() {
		ArrayProcessing processing = new ArrayProcessing();
		int[] emptyArray = new int[0];
		processing.getMinElement(emptyArray);
	}

	/* test the sum method if it works correctly */
	@Test
	public void test4() {
		ArrayProcessing processing = new ArrayProcessing();
		int[] testArray = { 1, 6, 7, 9, 3, 5, 8, 0, 3, 6 };
		int actualResult = processing.sum(testArray);
		int expectedResult = 48;
		assertEquals(expectedResult, actualResult);
	}

	/* test for null array. */
	@Test(expected = NullPointerException.class)
	public void test5() {
		ArrayProcessing processing = new ArrayProcessing();
		int[] emptyArray = null;
		processing.sum(emptyArray);
	}

	/* test for initialized, empty array. */
	@Test(expected = NullPointerException.class)
	public void test6() {
		ArrayProcessing processing = new ArrayProcessing();
		int[] emptyArray = new int[0];
		processing.sum(emptyArray);
	}

	/* Testing the print method */
	@Test
	public void test7() {
		ArrayProcessing processing = new ArrayProcessing();
		int[] testArray = { 1, 2, 3, 5, 7, 8, 5, 4 };
		String actualResult = processing.print(testArray);
		String expectedResult = "1,2,3,5,7,8,5,4";
		assertEquals(expectedResult, actualResult);
	}

	/* Testing for null array */
	@Test(expected = NullPointerException.class)
	public void test8() {
		ArrayProcessing processing = new ArrayProcessing();
		int[] testArray = null;
		processing.print(testArray);
	}

	/* testing for empty array */
	@Test(expected = StringIndexOutOfBoundsException.class)
	public void test9() {
		ArrayProcessing processing = new ArrayProcessing();
		int[] testArray = new int[0];
		processing.print(testArray);
	}
}
