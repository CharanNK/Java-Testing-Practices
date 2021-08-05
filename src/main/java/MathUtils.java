import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class MathUtils {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a,int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a*b;
    }

    public int divide(int a,int b) {
        return a/b;
    }

    public int[] reverseArray(int[] arr) {
        return IntStream.rangeClosed(1, arr.length).map(i -> arr[arr.length - i]).toArray();
    }

    public List<String> interableAssertion() {
        return Arrays.asList("one", "two", "three");
    }

    public double computeCircleRadius(int radius) {
        return Math.PI * Math.pow(radius, 2);
    }
}
