import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class question1 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Dave");

        ListIterator<String> iterator = names.listIterator();

        // Using hasNext() and next()
        System.out.println("Iterating forward using hasNext() and next():");
        while (iterator.hasNext()) {
            System.out.println("Index: " + iterator.nextIndex() + ", Element: " + iterator.next());
        }

        // Using hasPrevious() and previous()
        System.out.println("\nIterating backward using hasPrevious() and previous():");
        while (iterator.hasPrevious()) {
            System.out.println("Index: " + iterator.previousIndex() + ", Element: " + iterator.previous());
        }

        // Adding an element
        iterator = names.listIterator(); 
        iterator.next(); 
        System.out.println("\nAdding 'Eve' after the first element:");
        iterator.add("Eve");
        System.out.println("List after adding 'Eve': " + names);

        // Setting (replacing) an element
        iterator.next(); // Move to 'Bob'
        System.out.println("\nSetting 'Robert' in place of 'Bob':");
        iterator.set("Robert");
        System.out.println("List after setting 'Robert': " + names);

        // Removing an element
        iterator.previous(); 
        System.out.println("\nRemoving 'Eve':");
        iterator.remove();
        System.out.println("List after removing 'Eve': " + names);
    }
}
