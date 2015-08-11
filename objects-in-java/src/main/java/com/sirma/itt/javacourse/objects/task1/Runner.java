package com.sirma.itt.javacourse.objects.task1;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Runner {
	private static final Logger LOGGER = LoggerFactory.getLogger(Runner.class);

	public static void main(String[] args) {
		Sumator sum = new Sumator();

		// Int sumator
		int firstIntVariable = 5;
		int secondIntVariable = 9;
		int intSum = sum.sum(firstIntVariable, secondIntVariable);
		LOGGER.info("The sum of the integers " + firstIntVariable + " and " + secondIntVariable + " is: " + intSum);
		// floating point sumator
		float firstFloatVariable = 5.2353f;
		float secondFloatVariable = 7.3234f;

		LOGGER.info("The sum of the float values: " + firstFloatVariable + " and " + secondFloatVariable + " is: "
				+ sum.sum(firstFloatVariable, secondFloatVariable));

		// String sumator
		String firstStringVariable = new String("54");
		String secondStringVariable = new String("4342.4234235");
		LOGGER.info("The sum of the Strings: " + firstStringVariable + " and " + secondStringVariable + " is: "
				+ sum.sum(firstStringVariable, secondStringVariable));

		// BigInteger values
		BigDecimal firstDecimal = new BigDecimal(2342353);
		BigDecimal secondDecimal = new BigDecimal(4342.4234235);
		LOGGER.info("The sum of the big decimals " + firstDecimal.floatValue() + " and " + secondDecimal.floatValue()
				+ " is: " + sum.sum(firstDecimal, secondDecimal));
	}
}
