package com.switch486.mvnTraining.JTesting.java.basics_1;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class JavaBasics_Numbers {

    /**
     * @param num1
     *            first number
     * @param num2
     *            second number
     * @return both arguments multiplied
     */
    public static int multiply(int num1, int num2) {
        // TODO mnożenie
        return num1 * num2;
    }

    /**
     * @param numbersToMultiply
     *            the numbers that should be multiplied
     * @return result
     */
    public static int multiMultiply(int... numbersToMultiply) {
        // TODO mojemnozenie

        final OptionalInt result = Arrays.stream(numbersToMultiply).reduce(JavaBasics_Numbers::multiply);

        return result.getAsInt();
    }

    /**
     * @param n
     *            as n
     * @return n!
     */
    public static int factorial(int n) {
        // TODO Auto-generated method stub

        final IntStream range = IntStream.range(1, n + 1);
        return multiMultiply(range.toArray());
    }

    /**
     * @param number
     *            the number
     * @return sum of the digits in the number
     */
    public static int sumOfDigits(int number) {
        String s = "" + number;

        return s.chars().map(JavaBasics_Numbers::toI).reduce(Integer::sum).getAsInt();
    }

    public static int toI(int c) {
        return Character.getNumericValue(c);
    }

}
