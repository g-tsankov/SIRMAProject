package com.sirma.itt.javacourse.intro.task5;

/**
 * Class implementing two different methods for reversing an given array.
 * 
 * @author George
 */
public class ArrayReverse {
	/**
	 * First method for array reversaw. it uses logical XOR.
	 * 
	 * @param array
	 *            input array
	 * @param left
	 *            index of the left side of the array(usually 0)
	 * @param right
	 *            index of the right side of the array(usually array.lenght-1)
	 * @return the reversed array
	 */
	public int[] reverseArray(int[] array) {
		int leftIndex = 0;
		int rightIndex = array.length - 1;
		while (leftIndex < rightIndex) {
			array[leftIndex] = array[leftIndex] ^ array[rightIndex];
			array[rightIndex] = array[leftIndex] ^ array[rightIndex];
			array[leftIndex] = array[leftIndex] ^ array[rightIndex];
			leftIndex++;
			rightIndex--;
		}
		return array;
	}

	/**
	 * Second method for array revearsal. It uses a temporary variable to store
	 * one of the array elements.
	 * 
	 * @param array
	 *            array to reverse
	 * @param left
	 *            index of the left side of the array(usually 0)
	 * @param right
	 *            index of the right side of the array(usually array.lenght-1)
	 * @return the reversed array.
	 */
	public int[] reverseArrayVer2(int[] array) {
		int tmp;
		int leftIndex = 0;
		int rightIndex = array.length - 1;

		while (leftIndex < rightIndex) {
			tmp = array[leftIndex];
			array[leftIndex] = array[rightIndex];
			array[rightIndex] = tmp;
			leftIndex++;
			rightIndex--;
		}
		return array;
	}
}
