//LinkedList Methods

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class question2 {
    public static void main(String[] args) {
        LinkedList<String> sports = new LinkedList<>(List.of("Football", "Basketball", "Baseball", "Tennis"));
        System.out.println("LinkedList after adding elements: " + sports);

        sports.addFirst("Soccer");
        sports.addLast("Golf");
        System.out.println("LinkedList after adding 'Soccer' at the beginning and 'Golf' at the end: " + sports);

        System.out.println("Element at index 1: " + sports.get(1));
        System.out.println("First element in the LinkedList: " + sports.getFirst());
        System.out.println("Last element in the LinkedList: " + sports.getLast());

        sports.set(3, "Volleyball");
        System.out.println("LinkedList after setting 'Volleyball' at index 3: " + sports);

        sports.remove(2);
        System.out.println("LinkedList after removing element at index 2: " + sports);

        System.out.println("Size of the LinkedList: " + sports.size());

        System.out.println("Index of 'Tennis' in LinkedList: " + sports.indexOf("Tennis"));
        System.out.println("Last index of 'Tennis' in LinkedList: " + sports.lastIndexOf("Tennis"));

        System.out.println("Is LinkedList empty: " + sports.isEmpty());

        System.out.println("Iterating through the LinkedList:");
        sports.forEach(System.out::println);

        System.out.println("Iterating through the LinkedList using an iterator:");
        Iterator<String> iterator = sports.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        sports.clear();
        System.out.println("LinkedList after clearing all elements: " + sports);
        System.out.println("Is LinkedList empty after clear: " + sports.isEmpty());
    }
}

