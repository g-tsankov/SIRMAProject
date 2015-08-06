package com.sirma.itt.javacourse.intro.task7test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.sirma.itt.javacourse.intro.task7.RandomStringGen;

/**
 * Test case for RandomStringGen
 * 
 * @author George
 */
public class RandomStringGenTest {
	/**
	 * Test that covers the code;
	 */
	@Test
	public void coveringEverything() {
		RandomStringGen generate = new RandomStringGen();
		generate.generate(2, 2, 2);
		generate.generate(0, 2, 2);
		generate.generate(2, 0, 2);
		generate.generate(2, 2, 0);

	}

	/**
	 * Test when input is 0
	 */
	@Test
	public void emptyGenerate() {
		RandomStringGen generate = new RandomStringGen();
		String expectedResult = "";
		String actualResult = generate.generate(0, 0, 0);
		assertEquals(expectedResult, actualResult);
	}
}
