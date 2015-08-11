package com.sirma.itt.javacourse.intro.task6;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Class, realising the sum of large numbers, which are written in Strings. The
 * result is stored in a StringBuilder.
 * 
 * @author George
 */
public class SummingLargeNumbers {

	private static final Logger LOGGER = LoggerFactory.getLogger(SummingLargeNumbers.class);
	private int carry = 0;

	/**
	 * Method used to get the coresponding numbers from both String numbers.
	 * They are passed down to add() for calculation.The result is appended to a
	 * StringBuilder.
	 * 
	 * @param firstNumber
	 *            First String number.
	 * @param secondNumber
	 *            Second String number.
	 * @return The calculated result.
	 */
	public StringBuilder calculate(String firstNumber, String secondNumber) {
		String tempFirstNumber = firstNumber;
		String tempSecondNumber = secondNumber;
		// check length of numbers
		if (firstNumber.length() > secondNumber.length()) {
			tempSecondNumber = checkNumberLength(tempFirstNumber, tempSecondNumber);
		} else {
			tempFirstNumber = checkNumberLength(tempSecondNumber, tempFirstNumber);
		}

		// building the answer

		StringBuilder answer = new StringBuilder();
		for (int i = tempFirstNumber.length() - 1; i >= 0; i--) {
			/* Check if the character is a digit */
			boolean checkOne = Character.isDigit(tempFirstNumber.charAt(i));
			boolean checkTwo = Character.isDigit(tempSecondNumber.charAt(i));
			if (checkOne && checkTwo) {
				int passInt1 = Character.getNumericValue(tempFirstNumber.charAt(i));
				int passInt2 = Character.getNumericValue(tempSecondNumber.charAt(i));
				String tempSum = add(passInt1, passInt2);
				answer.append(tempSum);
			} else {
				LOGGER.info("A non integer has been inputted");
				throw new NumberFormatException();
			}
		}

		/*
		 * answer is built in a reverse order, so its needs to be returned in
		 * reverse.
		 */
		return answer.reverse();

	}

	/**
	 * Method used to add one integer at a time. Carry is changed for the next
	 * calculation, according to the result of the sum.
	 *
	 * @param firstNumber
	 *            the first number to sum
	 * @param secondNumber
	 *            the seconnd number to sum
	 * @return the sum of both numbers
	 */
	private String add(int firstNumber, int secondNumber) {
		int sum;
		sum = firstNumber + secondNumber + carry;
		if (sum > 9) {
			carry = 1;
			sum = sum - 10;
			String result = Integer.toString(sum);
			return result;
		} else {
			carry = 0;
			String result = Integer.toString(sum);
			return result;
		}
	}

	/**
	 * A method used when the input strings are not the same length. Enough
	 * zero's are inserted in order to equalize the length of both
	 * StringBuilders.
	 * 
	 * @param number
	 *            the number with less digits.
	 * @param difference
	 *            the difference between both StringBuilders (the gap that needs
	 *            to be filled)
	 * @return The equalized StringBuilder.
	 */
	private StringBuilder equalizeNumbers(StringBuilder number, int difference) {
		StringBuilder tempNumber = number;
		StringBuilder differenceString = new StringBuilder();

		for (int i = 0; i <= difference - 1; i++) {
			differenceString.append("0");
		}
		tempNumber = tempNumber.insert(0, differenceString);
		return tempNumber;
	}

	/**
	 * Method determing the difference between the shorter and longer number by
	 * length.
	 * 
	 * @param longerNumber
	 *            the longer number in length.
	 * @param shorterNumber
	 *            the shirter number in length.
	 * @return shorterNumber, equalized with the longerNumber.
	 */
	private String checkNumberLength(String longerNumber, String shorterNumber) {

		StringBuilder numTemp = new StringBuilder();
		numTemp.append(shorterNumber);
		int difference = longerNumber.length() - shorterNumber.length();
		numTemp = equalizeNumbers(numTemp, difference);
		shorterNumber = numTemp.toString();
		return shorterNumber;
	}
}
