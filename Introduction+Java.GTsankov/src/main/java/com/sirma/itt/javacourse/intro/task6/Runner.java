package com.sirma.itt.javacourse.intro.task6;

import org.slf4j.LoggerFactory;

/**
 * Runner class for SummingLargeNumbers class.
 * 
 * @author George
 */
public final class Runner {

	private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(Runner.class);

	/**
	 * Prevents instantiation.
	 */
	private Runner() {

	}

	/**
	 * Main method for SummingLargeNumbers class.
	 * 
	 * @param args
	 *            none used.
	 */
	public static void main(String[] args) {

		SummingLargeNumbers summing = new SummingLargeNumbers();
		String num1 = "4435157454357487453461984141634351687453";
		String num2 = "51613165133213513133551351351563156351651651536";

		StringBuilder answer = summing.calculate(num1, num2);
		String sum = answer.toString();
		LOGGER.info(num1 + " summed with");
		LOGGER.info(num2 + " equals:");
		LOGGER.info(sum);

	}
}
