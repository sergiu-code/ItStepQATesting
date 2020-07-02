package Tests;

import com.ItStep.Lesson.DivideByZeroException;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.time.LocalDate;
import java.time.LocalTime;

@Tag("Divide")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@DisplayName("test the divide method")
public class DivideClassTest {
    @BeforeAll
    public static void beforeAllMethod() {
        System.out.println("divide method test has begun " + LocalDate.now());

    }

    @AfterAll
    public static void afterAllMethod() {
        System.out.println("divide method test has ended " + LocalDate.now());
    }

    public double divide(double numberToBeDivided, double divisor) throws DivideByZeroException {
        double result = numberToBeDivided / divisor;
        if ((numberToBeDivided > 0 && divisor > 0) && (numberToBeDivided > divisor)) {
            return result;
        } else if (divisor == 0)
            throw new DivideByZeroException();
        return 0;
    }

    @BeforeEach
    void beforeEachMethod() {
        System.out.println("test has started at " + LocalTime.now());
    }

    @AfterEach
    void afterEachMethod() {
        System.out.println("test has ended at " + LocalTime.now());
    }

    @Order(1)
    @Test
    @DisplayName("testing positive path in divide method")
    void testPositivePathDivideMethod() {
        Assertions.assertEquals(3, divide(12, 4));
        System.out.println("test has passed validation successfully");
    }

    @Order(2)
    @DisplayName("testing negative paths in divide method")
    @ParameterizedTest(name = "test value {0} and {1} ")
    @CsvSource(value = {"-4,61", "1489,-4918", "50,51"})
    void testNegativePathDivideMethod(double numberToBeDivided, double divisor) {
        MatcherAssert.assertThat(divide(numberToBeDivided, divisor), Matchers.equalTo(0d));
        System.out.println("negative test has passed validation");
    }

    @Tag("Exception")
    @Order(3)
    @Test
    @DisplayName("expect an runtime exception")
    void testException() {
        Assertions.assertThrows(DivideByZeroException.class, () -> divide(50, 0));
        System.out.println("test has passed a validate exception");
    }
}