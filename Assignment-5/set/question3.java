// TreeSet Methods 

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class question3 {
    public static void main(String[] args) {
        SortedSet<Integer> numbers = new TreeSet<>(Set.of(5, 3, 7, 1));
        System.out.println("TreeSet after adding elements: " + numbers);

        numbers.add(3);
        System.out.println("TreeSet after attempting to add duplicate element: " + numbers);

        System.out.println("TreeSet contains '7': " + numbers.contains(7));
        System.out.println("TreeSet contains '2': " + numbers.contains(2));

        numbers.remove(5);
        System.out.println("TreeSet after removing '5': " + numbers);

        System.out.println("Size of the TreeSet: " + numbers.size());
        System.out.println("Is TreeSet empty: " + numbers.isEmpty());

        System.out.println("Iterating through the TreeSet:");
        numbers.forEach(System.out::println);

        System.out.println("HeadSet of TreeSet up to 3: " + numbers.headSet(3));
        System.out.println("SubSet of TreeSet from 1 to 7: " + numbers.subSet(1, 7));
        System.out.println("TailSet of TreeSet from 3: " + numbers.tailSet(3));

        numbers.clear();
        System.out.println("TreeSet after clearing all elements: " + numbers);
        System.out.println("Is TreeSet empty after clear: " + numbers.isEmpty());
    }
}
