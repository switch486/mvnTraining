package com.switch486.mvnTraining.JTesting.java.basics_1;

public class JavaBasics_Strings {
  String kotek;
    /**
     * @param source 
     *            string to reverse
     * @return reversed string
     */
    public static String reverse(String source) {// TODO moja metoda
       String odwrocony = "";
       char[] sourceTab = source.toCharArray();
       char[] slowoOdwrocone = new char[sourceTab.length];
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
        
//    	copyString = "";
    	char[] sourceTab = source.toCharArray();
    	char[]copyString = new char [sourceTab.length];
    	for(int i = 0; i < sourceTab.length; i++) {
    		copyString[i] = sourceTab[sourceTab.length];
    		copyString = new String(copyString);
    	}
        return copyString();
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
      
    	
		String uncesoredString;
		String forbiddenWord1;
		newString = ""
		char[] uncesoredStringTab = uncesoredString.toCharArray();
		for(int i = 0; i < uncensoredStringTab.length; i++) {
    		copyString[i] = sourceTab[sourceTab.length];
        return newStrintnnn;
    }

}
