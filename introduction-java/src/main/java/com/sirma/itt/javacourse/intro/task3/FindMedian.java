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
	 * Method for finding the Median value of an array(The sum of the elements
	 * before the median, which is element in the array, and after it should be
	 * as close as possible). The algorythm starts with getting a starting
	 * index. The sum of the elements on the left and the right is calculated.
	 * Their difference is used as a starting point. The index is then changed
	 * to the next value and the value of the index is added or subtracted to
	 * the corresponding margin. The index with the best margin(the median) is
	 * saved and passed when there are no more indexes.
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
		int margin = 0;
		int bestMargin = calculateMargin(sumLeftSide, sumRightSide);

		for (int i = 2; i <= array.length - 1; i++) {
			sumLeftSide = sumLeftSide + array[i - 1];
			sumRightSide = sumRightSide - array[i];
			bestMargin = chooseBestMargin(sumLeftSide, sumRightSide, margin, bestMargin, i);
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
		// calculations for the left side
		if (tempIndex == 0) {
			while (tempIndex < end) {
				sum = sum + array[tempIndex];
				tempIndex++;
			}
			// calculations for the right side
		} else {
			tempIndex++;
			while (tempIndex <= end) {
				sum = sum + array[tempIndex];
				tempIndex++;
			}
		}
		return sum;
	}

	/**
	 * Method used to initialize the bestMargin variable for the first time.
	 * 
	 * @param sumLeftSide
	 *            sum of the left side of the index
	 * @param sumRightSide
	 *            sum of the right side of the index
	 * @return the margin between the sums.
	 */
	private int calculateMargin(int sumLeftSide, int sumRightSide) {
		int margin;
		if (sumLeftSide > sumRightSide) {
			margin = sumLeftSide - sumRightSide;
		} else {
			margin = sumRightSide - sumLeftSide;
		}
		return margin;
	}

	private int chooseBestMargin(int sumLeftSide, int sumRightSide, int margin, int bestMargin, int arrayIndex) {

		margin = calculateMargin(sumLeftSide, sumRightSide);
		if (margin < bestMargin) {
			bestMargin = margin;
			index = arrayIndex;
		}
		return bestMargin;
	}

}
