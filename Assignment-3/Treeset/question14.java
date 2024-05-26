import java.util.TreeSet;
import java.util.SortedSet;

public class question14{
    public static void main(String[] args) {
        
        TreeSet<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);

        SortedSet<Integer> subset = set.subSet(2, 5);

        System.out.println("Subset from 2  to 5 : " + subset);
    }
}
