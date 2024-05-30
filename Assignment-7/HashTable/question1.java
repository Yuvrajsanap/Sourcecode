import java.util.Enumeration;
import java.util.Hashtable;

public class question1 {
    public static void main(String[] args) {
        Hashtable<String, Integer> table = new Hashtable<>();

        // Clear the table method
        table.clear();

        // Clone the table method
        @SuppressWarnings("unchecked")
        Hashtable<String, Integer> cloneTable = (Hashtable<String, Integer>) table.clone();

        // contains method
        boolean contains = table.contains(2);

        // Get a value by key
        Integer value = table.get("One");

        //elements enumeration
        Enumeration<Integer> elements = table.elements();

        // empty method
        boolean isEmpty = table.isEmpty();

        // Put a key-value pair
        table.put("One", 1);
        table.put("Two", 2);
        table.put("Three", 3);

        // Rehash method
        table = new Hashtable<>(table);

        // Remove method
        table.remove("Two");

        // Get the size of the table
        int size = table.size();

        // Get the string representation of the table
        String toString = table.toString();

        // Demonstration
        System.out.println("Table: " + toString);
        System.out.println("Size: " + size);
        System.out.println("Get 'One': " + value);
        System.out.println("Contains 2: " + contains);
        System.out.println("Is Empty: " + isEmpty);

        System.out.print("Elements: ");
        while (elements.hasMoreElements()) {
            System.out.print(elements.nextElement() + " ");
        }
        System.out.println();

        //ToString method
        System.out.println("After removing 'Two': " + toString);

        //clineTable method
        System.out.println("Cloned Table: " + cloneTable);

        //clear method
        table.clear();
        System.out.println("After clear: " + toString);
        System.out.println("Is Empty: " + isEmpty);
    }
}
