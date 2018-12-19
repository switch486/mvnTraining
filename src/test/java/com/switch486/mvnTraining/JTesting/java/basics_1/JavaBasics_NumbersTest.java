package com.switch486.mvnTraining.JTesting.java.basics_1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JavaBasics_NumbersTest {

    @Test
    public void testMultiplication() {
        // given
        int num1 = 3;
        int num2 = 4;

        // when
        int result = JavaBasics_Numbers.multiply(num1, num2);

        // then
        assertThat(result).isEqualTo(12);
    }

    @Test
    public void testMultiMultiplication() {
        // given

        // when
        int result = JavaBasics_Numbers.multiMultiply(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // then
        assertThat(result).isEqualTo(3628800);
    }

    @Test
    public void testFactorial() {
        // given

        // when
        int result = JavaBasics_Numbers.factorial(10);

        // then
        assertThat(result).isEqualTo(3628800);
    }

}
