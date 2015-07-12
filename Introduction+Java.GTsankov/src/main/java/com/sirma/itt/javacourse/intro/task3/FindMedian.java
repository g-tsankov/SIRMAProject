package com.sirma.itt.javacourse.intro.task3;

/**
 * Class,where the methods needed to find the element of the array, where the
 * sum of th elements before and after should be as close as possible.
 * 
 * @author George
 */
public class FindMedian {

	private int index = 0;

	/**
	 * 
	 * @param array
	 *            input array
	 * @return the index of the median element.
	 */

	public int findMedian(int[] array) {
		/**
		 * for a starting point,the sums at the left most possible index are
		 * calculated.
		 */
		if (array.length <= 2) {

			throw new IllegalArgumentException("The array is too small!");
		}

		int sumLeftSide = sumLeftAndRight(array, 0, 1);
		int sumRightSide = sumLeftAndRight(array, 1, array.length - 1);
		int tempSum;
		int sum;

		if (sumLeftSide > sumRightSide) {
			sum = sumLeftSide - sumRightSide;
		} else {
			sum = sumRightSide - sumLeftSide;
		}
		for (int i = 0; i <= array.length - 1; i++) {
			sumLeftSide = sumLeftAndRight(array, 0, i);
			sumRightSide = sumLeftAndRight(array, i, array.length - 1);
			if (sumLeftSide > sumRightSide) {
				tempSum = sumLeftSide - sumRightSide;
			} else {
				tempSum = sumRightSide - sumLeftSide;
			}
			if (tempSum < sum) {
				sum = tempSum;
				index = i;
			}
		}
		return index + 1;
	}

	/**
	 * Method used to calculate the sum of the elements to the left or elements
	 * to the right ,depending on the value of the index.
	 * 
	 * @param array
	 *            array that is worked on.
	 * @param index
	 *            a starting point for calculations
	 * @param end
	 *            ending point for calculations
	 * @return the sum of the elements from index to end
	 */
	private int sumLeftAndRight(int[] array, int index, int end) {
		if (index > end) {
			throw new IllegalArgumentException("The index can't point somewhere after the end of the array!");
		}
		int sum = 0;
		int tempIndex = index;
		/* calculations for the left side */
		if (tempIndex == 0) {
			while (tempIndex < end) {
				sum = sum + array[tempIndex];
				tempIndex++;
			}
			/* calculations for the right side */
		} else {
			tempIndex++;
			while (tempIndex <= end) {
				sum = sum + array[tempIndex];
				tempIndex++;
			}
		}
		return sum;
	}

}
