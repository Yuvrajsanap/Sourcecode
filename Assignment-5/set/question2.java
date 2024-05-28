//LinkedHashSet Methods
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class question2{
    public static void main(String[] args) {
        Set<Integer> numbers = new LinkedHashSet<>(Set.of(1, 2, 3, 4));
        System.out.println("LinkedHashSet after adding elements: " + numbers);

        numbers.add(1);
        System.out.println("LinkedHashSet after attempting to add duplicate element: " + numbers);

        System.out.println("LinkedHashSet contains '2': " + numbers.contains(2));
        System.out.println("LinkedHashSet contains '5': " + numbers.contains(5));

        numbers.remove(3);
        System.out.println("LinkedHashSet after removing '3': " + numbers);

        System.out.println("Size of the LinkedHashSet: " + numbers.size());
        System.out.println("Is LinkedHashSet empty: " + numbers.isEmpty());

        System.out.println("Iterating through the LinkedHashSet:");
        numbers.forEach(System.out::println);

        System.out.println("Iterating through the LinkedHashSet using an iterator:");
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        numbers.clear();
        System.out.println("LinkedHashSet after clearing all elements: " + numbers);
        System.out.println("Is LinkedHashSet empty after clear: " + numbers.isEmpty());
    }
}
