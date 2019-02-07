package com.switch486.mvnTraining.JTesting.java.basics_1;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JavaBasics_StringsTest {

    @Test
    public void testReverseString_Palindrome() {
        // given
        String source = "was it a rat i saw";

        // when
        String reversed = JavaBasics_Strings.reverse(source);

        // then
        assertThat(reversed).isEqualTo("was i tar a ti saw");
    }

    @Test
    public void testReverseString_Word() {
        // given
        String source = "mood";

        // when
        String reversed = JavaBasics_Strings.reverse(source);

        // then
        assertThat(reversed).isEqualTo("doom");
    }

    @Test
    public void testCopyingConstructor() {
        // given
        String source = "was it a rat i saw";

        // when
        String stringCopy = JavaBasics_Strings.copyStringValue(source);

        // then
        assertThat(stringCopy).isEqualTo(source);
        assertTrue(source != stringCopy);
    }

    @Test
    public void testCensorString_Kaligrafia() {
        // given
        String given = "Kaligra###fia";
        String forbidden = "###";

        // when
        String censoredString = JavaBasics_Strings.censorString(given, forbidden);

        // then
        assertThat(censoredString).isEqualTo("Kaligrafia");
    }

    @Test
    public void testCensorString_Lorem() {
        // given
        String loremIpsumString = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, "
            + "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. "
            + "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris "
            + "nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in "
            + "reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla "
            + "pariatur. Excepteur sint occaecat cupidatat non proident, sunt in "
            + "culpa qui officia deserunt mollit anim id est laborum.";

        String forbiddenWord = "#OMG#";

        StringBuilder uncensoredString = new StringBuilder(loremIpsumString);
        uncensoredString.insert(12, forbiddenWord);
        uncensoredString.insert(23, forbiddenWord);
        uncensoredString.insert(34, forbiddenWord);
        uncensoredString.insert(45, forbiddenWord);
        uncensoredString.insert(0, forbiddenWord);

        // when
        String censoredString = JavaBasics_Strings.censorString(uncensoredString.toString(), forbiddenWord);

        // then
        assertThat(censoredString).isEqualTo(loremIpsumString);
    }
    
    @Test
    public void testCensorString_null() {
    	//given
    	String uncensoredString = null;
    	String forbiddenWord = "#OMG#";
    	
    	//when
    	String censoredString = JavaBasics_Strings.censorString(uncensoredString, forbiddenWord);
    	
    	//then
    	assertThat(censoredString).isEqualTo(null);
    	
    }

    @Test
    public void testCountLetter_aaaa() {
        // given
        String given = "aaaa";
        char character = 'a';

        // when
        int letterCount = JavaBasics_Strings.countLetter(given, character);

        // then
        assertThat(letterCount).isEqualTo(4);
    }

    @Test
    public void testCountLetter_bbbb() {
        // given
        String given = "bbbb";
        char character = 'a';

        // when
        int letterCount = JavaBasics_Strings.countLetter(given, character);

        // then
        assertThat(letterCount).isEqualTo(0);
    }

    @Test
    public void testCountLetter_abba() {
        // given
        String given = "abba";
        char characterB = 'b';
        char characterA = 'a';

        // when
        int aCount = JavaBasics_Strings.countLetter(given, characterB);
        int bCount = JavaBasics_Strings.countLetter(given, characterA);

        // then
        assertThat(aCount).isEqualTo(2);
        assertThat(bCount).isEqualTo(2);
    }

    @Test
    public void testCountLetter_nullsafe() {
        // given
        String given = null;
        char character = 'a';

        // when
        int letterCount = JavaBasics_Strings.countLetter(given, character);

        // then
        assertThat(letterCount).isEqualTo(0);
    }

    @Test
    public void testLongestString_1string() {
        // given
        String given = "aaaa";

        // when
        String restult = JavaBasics_Strings.findLongestString(given);

        // then
        assertThat(restult).isEqualTo(given);
    }

    @Test
    public void testLongestString_4strings() {
        // given
        String s1 = "aaaa";
        String s2 = "dan";
        String s3 = "house";
        String s4 = "dog";

        // when
        String restult = JavaBasics_Strings.findLongestString(s1, s2, s3, s4);

        // then
        assertThat(restult).isEqualTo(s3);
    }

    @Test
    public void testLongestString_2EqualStrings() {
        // given
        String s1 = "aaaa";
        String s2 = "dance";
        String s3 = "house";
        String s4 = "dog";

        // when
        String restult = JavaBasics_Strings.findLongestString(s1, s2, s3, s4);

        // then
        assertThat(restult).isEqualTo(s2);
    }

    @Test(expected = Exception.class)
    public void testLongestString_noArguments() {
        // given

        // when
        JavaBasics_Strings.findLongestString();

        // then
    }

}
