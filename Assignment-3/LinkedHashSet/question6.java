// iterator method

import java.util.Iterator;
import java.util.LinkedHashSet;

public class question6 {
    public static void main(String[] args) {
       
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");

        Iterator<String> iterator = set.iterator();

        System.out.println("Elements in the LinkedHashSet:");
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
    }
}

