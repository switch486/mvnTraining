package com.switch486.mvnTraining.JTesting.java.basics_1;

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

}
