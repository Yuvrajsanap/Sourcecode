import java.util.TreeSet;
import java.util.SortedSet;

public class question15{
    public static void main(String[] args) {
        
        TreeSet<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);

        SortedSet<Integer> tailSet = set.tailSet(3);

        System.out.println("Tail set from 3 (inclusive): " + tailSet);
    }
}
