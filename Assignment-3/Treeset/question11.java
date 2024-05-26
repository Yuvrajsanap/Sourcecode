// set last method 

import java.util.TreeSet;

public class question11 {
    public static void main(String[] args) {
        
        TreeSet<Integer> set = new TreeSet<>();
        set.add(5);
        set.add(2);
        set.add(8);

      
        Integer lastElement = set.last();

        System.out.println("Last element in the TreeSet: " + lastElement);
    }
}
