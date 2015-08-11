package com.sirma.itt.javacourse.intro.task1test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.sirma.itt.javacourse.intro.task1.GreatestCommonDivisor;

/**
 * GreatestCommonDivisorTest tests different situations, depending on the input
 * numbers that we give to the calculate method in GreatestCommonDivisor class.
 * 
 * @author Georgi Tsankov
 */
public class GreatestCommonDivisorTest {

	/**
	 * This test is when the firstVariable is bigger than the secondVarialbe.
	 */
	@Test
	public void biggerFirstVariable() {
		GreatestCommonDivisor gcd = new GreatestCommonDivisor();
		int actualResult = gcd.calculate(20, 2);
		int expected = 2;
		assertEquals(expected, actualResult);
	}

	/**
	 * This test is when the secondVariable is bigger than the firstVariable.
	 */
	@Test
	public void biggerSecondVarialbe() {
		GreatestCommonDivisor gcd = new GreatestCommonDivisor();
		int actualResult = gcd.calculate(2, 22);
		int expected = 2;
		assertEquals(expected, actualResult);
	}

	/**
	 * This test is when both variables are equal.
	 */
	@Test
	public void equalVariables() {
		GreatestCommonDivisor gcd = new GreatestCommonDivisor();
		int actualResult = gcd.calculate(2, 2);
		int expected = 2;
		assertEquals(expected, actualResult);
	}

	/**
	 * This test is when firstVariable is 0.
	 */
	@Test
	public void firstIsZero() {
		GreatestCommonDivisor gcd = new GreatestCommonDivisor();
		int actualResult = gcd.calculate(0, 2);
		int expected = 0;
		assertEquals(expected, actualResult);
	}

	/**
	 * This test is when secondVariable is 0.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void secondIsZero() {
		GreatestCommonDivisor gcd = new GreatestCommonDivisor();
		gcd.calculate(35, 0);
	}

	/**
	 * This test is when both variables are 0.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void bothZero() {
		GreatestCommonDivisor gcd = new GreatestCommonDivisor();
		gcd.calculate(0, 0);
	}

	/**
	 * This test is when initially one variable is bigger, but eventually gets
	 * smaller than the second variable.
	 */
	@Test
	public void firstBiggerThenSecond() {
		GreatestCommonDivisor gcd = new GreatestCommonDivisor();
		int actualResult = gcd.calculate(8, 20);
		int expected = 4;
		assertEquals(expected, actualResult);
	}
}
