package com.sirma.itt.javacourse.intro.task4test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import com.sirma.itt.javacourse.intro.task4.QuickSort;

/**
 * Test case for the QuickSort class.
 * 
 * @author George
 */
public class QuickSortTest {

	@Test
	public void test() {
		int[] testArray = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		int[] expectedArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		QuickSort sort = new QuickSort();
		sort.quickSort(testArray, 0, testArray.length - 1);
		assertArrayEquals(expectedArray, testArray);
	}

	@Test
	public void test2() {
		int[] testArray = { 4 };
		QuickSort sort = new QuickSort();
		sort.quickSort(testArray, 0, 0);
	}
}
