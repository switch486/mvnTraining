package com.switch486.mvnTraining.JTesting.java.basics_1;

//import org.assertj.core.internal.Strings;
import org.springframework.util.StringUtils;

public class JavaBasics_Strings {

	/**
	 * @param source
	 *            string to reverse
	 * @return reversed string
	 */
	public static String reverse(String source) {// TODO moja metoda

		char[] sourceTab = source.toCharArray();
		char[] slowoOdwrocone = new char[sourceTab.length];
		String odworcony = "";
		for (int i = 0; i < sourceTab.length; i++) {
			slowoOdwrocone[i] = sourceTab[sourceTab.length - i - 1];
			odworcony = new String(slowoOdwrocone);
		}
		return odworcony;
	}

	/**
	 * @param source
	 *            the String source to be copied
	 * @return a copy of the string
	 */
	public static String copyStringValue(String source) {
		String result = "";

		char[] sourceTab = source.toCharArray();
		char[] copyString = new char[sourceTab.length];
		for (int i = 0; i < sourceTab.length; i++) {
			copyString[i] = sourceTab[i];
			result = new String(copyString);
		}
		return result;
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
        	
	return StringUtils.replace(uncensoredString, forbiddenWord, null);//znalazłam takie cudo tu nie działa any idea??
        
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
		int numberLetter = 0;
		char znakiNapisu = 0;
		for(int i = 0; i < input.length(); i++) {
			znakiNapisu = input.charAt(i);
		}
		if (znakiNapisu == letter) {
			numberLetter++;
		}
		return numberLetter;
	}
}

	/**
	 * @param strings
	 *            the string array to search for the longest one
	 * @return the longest string according to the string.length method
	 */
//	public static String findLongestString(String... strings) {
//		public int length ();
//		
//		
//}
//		
//return null;
//		
//	}
//
//}
