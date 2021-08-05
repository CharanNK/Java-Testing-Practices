import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    MathUtils mathUtils = new MathUtils();

    static private boolean checkBooleanWithBeforeAll;

    private boolean checkBooleanWithBeforeEach;

    @BeforeAll
    static void setup() {  //method annotated with @BeforeAll has to be made static
        checkBooleanWithBeforeAll = true;
    }

    @BeforeEach
    void setBeforeEach() {
        checkBooleanWithBeforeEach = true;
    }

    @DisplayName("Add method test")
    @Test
    void addTest() {
        int expected = 2;
        int actual = mathUtils.add(1, 1);
        checkBooleanWithBeforeAll = false;

        assertEquals(expected, actual, "The method adds two numbers");
    }

    @DisplayName("Reverse array test")
    @Test
    void reverseArrayTest() {
        int[] arr = {1, 2, 3, 4, 5};
        int[] expected = {5, 4, 3, 2, 1};

        System.out.println("Boolean check value :"+checkBooleanWithBeforeAll); //returns false as it is set to false in previous method and @BeforeAll runs only once

        int[] actual = mathUtils.reverseArray(arr);

        assertArrayEquals(expected, actual);
    }

    @Test
    void iterableAssertionTest() {
        List<String> expected = Arrays.asList("one", "two", "three");
        List<String> actual = mathUtils.interableAssertion();

        assertIterableEquals(expected, actual);
        // Can also be done by :
        // assertArrayEquals(expected.toArray(),actual.toArray());
    }

    @Test
    void interableAssertionTest_noMatch() {
        List<String> expected = Arrays.asList("one", "two", "three", "four");
        List<String> actual = mathUtils.interableAssertion();

        assertFalse(expected.equals(actual), "This will pass");
    }

    @Test
    void testComputeCircleRadius() {
        assertEquals(Math.PI * 10 * 10, mathUtils.computeCircleRadius(10), "Returns circle area");
    }

    @Test
    void subtractionTest() {
        checkBooleanWithBeforeEach = false;
    }

    @Test
    void multiplicationTest() {
        System.out.println("checkBooleanWithBeforeEach value : "+checkBooleanWithBeforeEach); //returns true since the value is reset before each test by @Before method.
    }

    @Test
    void divideTest() {
        assertThrows(ArithmeticException.class, () -> mathUtils.divide(1, 0),
                "Divide by 0 throws ArithmeticException");
    }
}