package com.sirma.itt.javacourse.intro.task6test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.sirma.itt.javacourse.intro.task6.SummingLargeNumbers;

/**
 * JUnit test case for the SummingLargeNumbers class.
 * 
 * @author George
 */
public class SummingLargeNumbersTest {

	/** Test when number 1 is longer than number 2 */
	@Test
	public void test() {
		SummingLargeNumbers sum = new SummingLargeNumbers();
		String expectedResult = "660972939959967857";
		StringBuilder actualResult = sum.calculate("654131375512435325", "6841564447532532");
		String actualResultString = actualResult.toString();
		assertEquals(expectedResult, actualResultString);
	}

	/** Test when number 2 is longer than number 1 */
	@Test
	public void test2() {
		SummingLargeNumbers sum = new SummingLargeNumbers();
		String expectedResult = "660972939959967857";
		StringBuilder actualResult = sum.calculate("6841564447532532", "654131375512435325");
		String actualResultString = actualResult.toString();
		assertEquals(expectedResult, actualResultString);
	}

	/** Test when the input string has a character different than a digit */
	@Test(expected = NumberFormatException.class)
	public void test3() {
		SummingLargeNumbers sum = new SummingLargeNumbers();
		sum.calculate("2131532532f354123", "123807123012739217");
	}

	@Test(expected = NumberFormatException.class)
	public void test4() {
		SummingLargeNumbers sum = new SummingLargeNumbers();
		sum.calculate("2131532532354123", "12380f7123012739217");
	}

	@Test(expected = NumberFormatException.class)
	public void test5() {
		SummingLargeNumbers sum = new SummingLargeNumbers();
		sum.calculate("21315325323f54123", "12380f7123012739217");
	}
}
