package com.switch486.mvnTraining.JTesting.java.basics_1;

import java.util.Arrays;

public class JavaBasics_Strings {

    /**
     * @param source
     *            string to reverse
     * @return reversed string
     */
    public static String reverse(String source) {
        // TODO Auto-generated method stub

        StringBuilder sb = new StringBuilder(source);
        return sb.reverse().toString();
    }

    /**
     * @param source
     *            the String source to be copied
     * @return a copy of the string
     */
    public static String copyStringValue(String source) {
        // TODO Auto-generated method stub
        return new String(source);
    }

    /**
     * This function should censor a String. Examples:
     * <p>
     * censorString("aaabbbccc", "bbb") -> "aaaccc"
     * <p>
     *
     * @param uncensoredString
     *            source string
     * @param forbiddenWord
     *            word that should be removed from the source
     * @return uncensoredString with the forbiddenWord removed from it.
     */
    public static String censorString(String uncensoredString, String forbiddenWord) {
        // TODO Auto-generated method stub

        StringBuilder sb = new StringBuilder(uncensoredString);

        int indexOf = sb.indexOf(forbiddenWord);
        while (indexOf != -1) {
            sb.replace(indexOf, forbiddenWord.length() + indexOf, "");
            indexOf = sb.indexOf(forbiddenWord);
        }

        return sb.toString();
    }

    /**
     * This function counts appearances of a specific letter in an input string.
     *
     * <p>
     * countLetter("aaaa", 'a') -> 4
     * <p>
     *
     * @param input
     *            the input string
     * @param letter
     *            the letter to search for
     * @return number of appearances in the input string
     */
    public static int countLetter(String input, char letter) {
        // TODO implement the method body
        if (input == null) {
            return 0;
        }

        return input.chars().map(a -> a == letter ? 1 : 0).reduce(Integer::sum).getAsInt();
    }

    /**
     * @param strings
     *            the string array to search for the longest one
     * @return the longest string according to the string.length method
     */
    public static String findLongestString(String... strings) {
        // TODO implement the method body

        return Arrays.stream(strings).reduce((s1, s2) -> s2.length() > s1.length() ? s2 : s1).get();
    }

}
