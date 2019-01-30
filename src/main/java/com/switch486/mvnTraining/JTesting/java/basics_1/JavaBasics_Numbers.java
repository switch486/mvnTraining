package com.switch486.mvnTraining.JTesting.java.basics_1;

public class JavaBasics_Numbers {

	public static int multiply(int num1, int num2) {
		return num1 * num2;

	}

	/**
	 * @param numbersToMultiply
	 *            the numbers that should be multiplied
	 * @return result
	 */
	public static int multiMultiply(int... numbers) {
		int element1 = 1;
		for (int el : numbers) {

			element1 *= el;
		}
		return element1;
	}

	public static long factorial(int n) {
		long silnia = 1;
		for (int i = 2; i <= n; i++) {
			
			silnia = silnia * i;
		}

		return silnia;
	}

    /**
     * @param number
     *            the number
     * @return sum of the digits in the number
     */
    public static int sumOfDigits(int number) {
        return -1;
    }

}
