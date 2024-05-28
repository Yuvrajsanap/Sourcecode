//ArrayList Methods

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class question1{
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4));
        System.out.println("ArrayList after adding elements: " + numbers);

        numbers.add(2, 5);
        System.out.println("ArrayList after adding '5' at index 2: " + numbers);

        System.out.println("Element at index 1: " + numbers.get(1));

        numbers.set(3, 6);
        System.out.println("ArrayList after setting '6' at index 3: " + numbers);

        numbers.remove(2);
        System.out.println("ArrayList after removing element at index 2: " + numbers);

        System.out.println("Size of the ArrayList: " + numbers.size());

        System.out.println("ArrayList contains '3': " + numbers.contains(2));
        System.out.println("ArrayList contains '7': " + numbers.contains(7));

        System.out.println("Index of '3' in ArrayList: " + numbers.indexOf(6));
        System.out.println("Last index of '3' in ArrayList: " + numbers.lastIndexOf(3));

        System.out.println("Array representation of ArrayList: " + numbers.toArray());

        ((ArrayList<Integer>) numbers).trimToSize();
        System.out.println("ArrayList after trimming excess capacity: " + numbers);

        System.out.println("Is ArrayList empty: " + numbers.isEmpty());

        System.out.println("Iterating through the ArrayList:");
        numbers.forEach(System.out::println);

        Iterator<Integer> iterator = numbers.iterator();
        System.out.println("Iterating using an iterator:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        numbers.clear();
        System.out.println("ArrayList after clearing all elements: " + numbers);
        System.out.println("Is ArrayList empty after clear: " + numbers.isEmpty());
    }
}
