import java.util.Vector;
import java.util.Arrays;

public class question6 {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>(Arrays.asList(10, 20, 30));
        boolean containsAllElements = vector.containsAll(Arrays.asList(10, 20));
        System.out.println("Vector contains all elements: " + containsAllElements);
    }
}
