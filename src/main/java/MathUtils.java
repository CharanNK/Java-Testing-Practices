import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class MathUtils {
    public int add(int a, int b) {
        return a + b;
    }

    public int[] reverseArray(int[] arr) {
        return IntStream.rangeClosed(1,arr.length).map(i->arr[arr.length-i]).toArray();
    }

    public List<String> interableAssertion() {
        return Arrays.asList("one","two","three");
    }
}
