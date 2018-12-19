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
    public void testReverseString() {
        // given
        String source = "was it a rat i saw";

        // when
        String reversed = JavaBasics_Strings.reverse(source);

        // then
        assertThat(reversed).isEqualTo("was i tar a ti saw");
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
    public void testCensorString() {
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

}
