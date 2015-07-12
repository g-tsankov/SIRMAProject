package com.sirma.itt.javacourse.intro.task1;

/**
 * The class is used to calculate the Greatest Common Divisor. It contains the
 * method calculate, in which we calculate the Greatest Common Divisor.The
 * algorythm used is: while both numbers are not equal subtract the less from
 * the bigger and assign the result to the bigger one
 * 
 * @author Georgi Tsankov
 */
public class GreatestCommonDivisor {

	/**
	 * this is the method that calculates the Greatest Common Divisor.
	 * 
	 * resultVariable is used as a temporary variable within the loop,
	 * eventually taking the value of the Greatest Common Divisor when the loop
	 * is finished.
	 * 
	 * @param originalFirstVariable
	 *            the first variable passed from main
	 * @param originalSecondVariable
	 *            the second variable passed from main
	 * @return resultVariable passed as a end result
	 */
	public int calculate(final int originalFirstVariable, final int originalSecondVariable) {
		/*
		 * firstVariable and secondVariable are local variables that are used
		 * for the calculations.
		 */
		int firstVariable = originalFirstVariable;
		int secondVariable = originalSecondVariable;
		int resultVariable;
		if ((firstVariable == 0) || (secondVariable == 0)) {
			resultVariable = 0;
			return resultVariable;
		}

		while (firstVariable != secondVariable) {
			if (firstVariable > secondVariable) {
				resultVariable = firstVariable - secondVariable;
				firstVariable = resultVariable;
			} else {
				resultVariable = secondVariable - firstVariable;
				secondVariable = resultVariable;
			}
		}

		resultVariable = firstVariable;

		return resultVariable;
	}
}
