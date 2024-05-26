// clear method 

import java.util.LinkedHashSet;

public class question2{
    public static void main(String[] args) {
     
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);

        System.out.println("Elements in the set before clear: " + set);

        // Clear the LinkedHashSet
        set.clear();

        System.out.println("Elements in the set after clear: " + set);
    }
}
