import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class MathUtilsTest {

    MathUtils mathUtils = new MathUtils();

    @Test
    void addTest() {
        int expected = 2;
        int actual = mathUtils.add(1,1);

        assertEquals(expected,actual);
    }

    @Test
    void reverseArrayTest() {
        int[] arr = {1,2,3,4,5};
        int[] expected = {5,4,3,2,1};

        int[] actual = mathUtils.reverseArray(arr);
        System.out.println(Arrays.toString(actual));

        assertArrayEquals(expected,actual);
    }

    @Test
    void iterableAssertionTest() {
        List<String> expected = Arrays.asList("one","two","three");
        List<String> actual = mathUtils.interableAssertion();

        assertIterableEquals(expected,actual);
        // Can also be done by :
        // assertArrayEquals(expected.toArray(),actual.toArray());
    }

    @Test
    void interableAssertionTest_noMatch() {
        List<String> expected = Arrays.asList("one","two","three","four");
        List<String> actual = mathUtils.interableAssertion();

        assertIterableEquals(expected,actual);
    }
}