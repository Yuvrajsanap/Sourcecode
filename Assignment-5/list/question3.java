// Vector Methods 

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class question3 {
    public static void main(String[] args) {
        Vector<Integer> numbers = new Vector<>(List.of(1, 2, 3, 4));
        System.out.println("Vector after adding elements: " + numbers);

        numbers.add(2, 5);
        System.out.println("Vector after adding '5' at index 2: " + numbers);

        System.out.println("Element at index 1: " + numbers.get(1));
        System.out.println("Element at index 2: " + numbers.get(2));

        numbers.set(3, 6);
        System.out.println("Vector after setting '6' at index 3: " + numbers);

        numbers.remove(2);
        System.out.println("Vector after removing element at index 2: " + numbers);

        System.out.println("Size of the Vector: " + numbers.size());
        numbers.setSize(7);
        System.out.println("Vector after setting size to 7: " + numbers);

        Vector<Integer> subList = new Vector<>(List.of(3, 4));
        System.out.println("Vector contains all elements of sublist: " + numbers.containsAll(subList));

        System.out.println("First element in the Vector: " + numbers.firstElement());
        System.out.println("Last element in the Vector: " + numbers.lastElement());

        System.out.println("Is Vector empty: " + numbers.isEmpty());

        System.out.println("Iterating through the Vector:");
        numbers.forEach(System.out::println);

        System.out.println("Iterating through the Vector using an iterator:");
        Iterator<Integer> iterator = numbers.iterator();
        iterator.forEachRemaining(System.out::println);

        System.out.println("Iterating through the Vector using an enumeration:");
        Enumeration<Integer> enumeration = numbers.elements();
        enumeration.asIterator().forEachRemaining(System.out::println);

        numbers.clear();
        System.out.println("Vector after clearing all elements: " + numbers);
        System.out.println("Is Vector empty after clear: " + numbers.isEmpty());
    }
}
