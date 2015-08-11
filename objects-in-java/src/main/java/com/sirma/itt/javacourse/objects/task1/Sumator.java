package com.sirma.itt.javacourse.objects.task1;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Sumator class implementing methods for summing different inputs.
 * 
 * @author George
 */
public class Sumator {
	/**
	 * Method for summing Integer values.
	 * 
	 * @param a
	 *            first integer
	 * @param b
	 *            second integer
	 * @return the sum
	 */
	public int sum(int a, int b) {
		return a + b;
	}

	/**
	 * Method for summing fload values.
	 * 
	 * @param a
	 *            first float
	 * @param b
	 *            second float
	 * @return the sum
	 */
	public float sum(float a, float b) {
		return a + b;
	}

	/**
	 * Method for summing numbers from strings.
	 * 
	 * @param a
	 *            first Variable
	 * @param b
	 *            second Variable
	 * @return the sum
	 */
	public String sum(String a, String b) {
		BigDecimal firstVariable = new BigDecimal(a);
		BigDecimal secondVariable = new BigDecimal(b);
		BigDecimal sum = firstVariable.add(secondVariable);
		return sum.toString();
	}

	/**
	 * Method for summing BigDecimal objects using generics.
	 * 
	 * @param a
	 *            first variable
	 * @param b
	 *            second variable
	 * @return
	 * @return the sum
	 */

	public <T extends BigDecimal> T sum(T a, T b) {
		T add = (T) a.add(b);
		return add;
	}

	public BigInteger sum(BigInteger firstBigInteger, BigInteger secondBigInteger) {
		int intSum = firstBigInteger.intValue() + secondBigInteger.intValue();
		BigInteger sum = new BigInteger(Integer.toString(intSum));
		return sum;
	}
}
