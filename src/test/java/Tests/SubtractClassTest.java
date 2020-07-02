package Tests;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@Tag("Subtract")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@DisplayName("Test subtract method")
public class SubtractClassTest {
    public int subtract(int firstNumber, int secondNumber) {
        int result = firstNumber - secondNumber;
        if ((firstNumber >= 0 && secondNumber >= 0) && (firstNumber > secondNumber)) {
            return result;
        } else
            return -1;
    }

    @Order(1)
    @Test
    @DisplayName("testing positive path in subtract method")
    void testPositivePathsOfDivideMethod() {
        Assertions.assertEquals(50, subtract(60, 10));
    }

    @Order(2)
    @DisplayName("testing negative paths in subtract method")
    @ParameterizedTest(name = "testing values {0} and {1}")
    @CsvSource(value = {"-2615,456", "48,-64", "16,35", "0,0"})
    void testNegativePathsOfDivideMethod(int firstNumber, int secondNumber) {
        MatcherAssert.assertThat(subtract(firstNumber, secondNumber), Matchers.equalTo(-1));
    }

}




