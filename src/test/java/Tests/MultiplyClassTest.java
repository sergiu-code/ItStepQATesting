package Tests;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@Tag("Multiply")
@DisplayName("Test multiply method")
public class MultiplyClassTest {
    public static double multiply(double firstNumber, double secondNumber) {
        double result = firstNumber * secondNumber;
        if ((firstNumber >= 0 && firstNumber <= 100) && (secondNumber >= 0 && secondNumber <= 100)) {
            return result;
        } else
            return 0;
    }

    @Test
    @DisplayName("testing numbers that are inside the range  0-100")
    public void testPositiveNumbersInsideRange() {
        Assertions.assertEquals(1000, multiply(10, 100));
    }

    @DisplayName("testing with a five negative tests at once")
    @ParameterizedTest(name = "test value {0} and {1} in the given range 0-100")
    @CsvSource(value = {"-1,101", "101,-1", "-1,22", "101,22", "50,-3", "99,150"})
    void testWithValueSources(double valueOne, double valueSecond) {
//        Assertions.assertEquals(0, multiply(valueOne,valueSecond), "doesn't multiply values that are outside the range 0-100");
        MatcherAssert.assertThat(multiply(valueOne, valueSecond), Matchers.equalTo(0d));
    }
}

