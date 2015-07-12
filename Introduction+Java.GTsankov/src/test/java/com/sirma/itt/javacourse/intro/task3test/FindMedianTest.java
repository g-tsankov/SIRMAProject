package com.sirma.itt.javacourse.intro.task3test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.sirma.itt.javacourse.intro.task3.FindMedian;

/**
 * 
 * @author George
 */
public class FindMedianTest {
	/*
	 * Test for complete coverage of the code.
	 */
	@Test
	public void test() {
		FindMedian median = new FindMedian();
		int[] testArray = { 1, 5, 7, 8, 4, 78, 4, 5, 3, 7, 8, 3, 4, 34 };
		int actualResult = median.findMedian(testArray);
		int expectedResult = 7;
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void test2() {
		FindMedian median = new FindMedian();
		int[] testArray = { 253, 634, 23 };
		int actualResult = median.findMedian(testArray);
		int expectedResult = 1;
		assertEquals(expectedResult, actualResult);
	}

	/**
	 * Test when the array is to small to calculate the median (less than 3
	 * elements)
	 */
	@Test(expected = IllegalArgumentException.class)
	public void test3() {
		FindMedian median = new FindMedian();
		int[] testArray = { 32, 632 };
		median.findMedian(testArray);
	}

}
