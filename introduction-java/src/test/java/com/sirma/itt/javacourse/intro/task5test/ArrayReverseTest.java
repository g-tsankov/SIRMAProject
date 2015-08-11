package com.sirma.itt.javacourse.intro.task5test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import com.sirma.itt.javacourse.intro.task5.ArrayReverse;

/**
 * Test case for the ArrayReverse class.
 * 
 * @author George
 */
public class ArrayReverseTest {
	/** testing both methods if they work correctly */
	@Test
	public void test() {
		ArrayReverse reverse = new ArrayReverse();
		int[] testArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] expectedResult = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		int[] actualResult = reverse.reverseArray(testArray);
		assertArrayEquals(expectedResult, actualResult);
	}

	@Test
	public void test2() {
		ArrayReverse reverse = new ArrayReverse();
		int[] testArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] expectedResult = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		int[] actualResult = reverse.reverseArrayUsingTempVariable(testArray);
		assertArrayEquals(expectedResult, actualResult);
	}
}