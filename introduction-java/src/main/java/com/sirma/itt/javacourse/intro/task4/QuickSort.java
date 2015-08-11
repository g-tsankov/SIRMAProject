package com.sirma.itt.javacourse.intro.task4;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Class implementing the QuickSort algorythm.
 * 
 * @author George
 */
public class QuickSort {

	private static final Logger LOGGER = LoggerFactory.getLogger(QuickSort.class);

	/**
	 * Partition method,chooses a pivot value that is in the middle of the
	 * array. Then it puts the values that are greater from the pivot to the
	 * right side, and the ones that are smaller to the left side. The process
	 * is repeated until the array is sorted out.
	 * 
	 * @param array
	 *            input array
	 * @param leftIndex
	 *            the the left most element from the array the method is working
	 *            with
	 * @param rightIndex
	 *            the right most element from the array that the method is
	 *            working with
	 * @return the left index
	 */
	private int partition(int[] array, int leftIndex, int rightIndex) {
		int tempLeftIndex = leftIndex;
		int tempRightIndex = rightIndex;
		int temp;
		int pivot = array[(tempLeftIndex + ((tempRightIndex - tempLeftIndex) / 2))];

		while (tempLeftIndex <= tempRightIndex) {
			while (array[tempLeftIndex] < pivot)
				tempLeftIndex++;
			while (array[tempRightIndex] > pivot)
				tempRightIndex--;
			if (tempLeftIndex <= tempRightIndex) {
				temp = array[tempLeftIndex];
				array[tempLeftIndex] = array[tempRightIndex];
				array[tempRightIndex] = temp;
				tempLeftIndex++;
				tempRightIndex--;
			}
		}

		return tempLeftIndex;
	}

	/**
	 * Method realising the quicksort algorythm using recursion.
	 * 
	 * @param array
	 *            array
	 * @param left
	 *            left index of the array
	 * @param right
	 *            right index of the array
	 * @return
	 */
	public void quickSort(int[] array, int left, int right) {
		if (array.length < 2) {
			LOGGER.info("The array is too small to sort!");
			return;
		}
		int index = partition(array, left, right);
		if (left < index - 1)
			quickSort(array, left, index - 1);
		if (index < right)
			quickSort(array, index, right);
	}
}
