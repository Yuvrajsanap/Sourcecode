import java.util.Comparator;
import java.util.TreeSet;

public class question5{
    public static void main(String[] args) {

        TreeSet<Integer> set = new TreeSet<>(Comparator.reverseOrder());

        set.add(5);
        set.add(2);
        set.add(8);

        System.out.println("Elements in the TreeSet sorted in reverse order: " + set);
    }
}
