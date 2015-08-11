package com.sirma.itt.javacourse.objects.task1test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.junit.Test;

import com.sirma.itt.javacourse.objects.task1.Sumator;

public class SumatorTest {

	@Test
	public void intTest() {
		Sumator sum = new Sumator();
		int actualResult = sum.sum(100, 50);
		int expectedResult = 150;
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void floadTest() {
		Sumator sum = new Sumator();
		float actualResult = sum.sum(3532.754f, 2135.634f);
		float expectedResult = 5668.388f;
		assertEquals(expectedResult, actualResult, 0.001);
	}

	@Test
	public void intStringTest() {
		Sumator sum = new Sumator();
		String actualResult = sum.sum("500", "200");
		String expectedResult = "700";
		assertTrue(expectedResult.equals(actualResult));
	}

	@Test
	public void doubleStringTest() {
		Sumator sum = new Sumator();
		String actualResult = sum.sum("120.40", "129.60");
		String expectedResult = "250";
		assertEquals(Double.parseDouble(expectedResult), Double.parseDouble(actualResult), 0.01);
	}

	@Test
	public void mixedStringTest() {
		Sumator sum = new Sumator();
		String actualResult = sum.sum("100", "100.40");
		String expectedResult = "200.40";
		assertEquals(Double.parseDouble(expectedResult), Double.parseDouble(actualResult), 0.01);
	}

	@Test(expected = IllegalArgumentException.class)
	public void illegalStringTest() {
		Sumator sum = new Sumator();
		sum.sum("1234/32", "2331");
	}

	@Test
	public void bigDecimalTest() {
		Sumator sum = new Sumator();
		BigDecimal actualResult = sum.sum(new BigDecimal(1234), new BigDecimal(3214));
		BigDecimal expectedResult = new BigDecimal(4448);
		assertEquals(expectedResult.intValue(), actualResult.intValue());
	}

	@Test
	public void bigIntegerTest() {
		Sumator sum = new Sumator();
		BigInteger actualResult = sum.sum(new BigInteger("1234"), new BigInteger("3214"));
		BigInteger expectedResult = new BigInteger("4448");
		assertEquals(expectedResult.intValue(), actualResult.intValue());
	}
}
