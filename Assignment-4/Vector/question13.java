import java.util.Vector;

public class question13 {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Orange");
        vector.add("Banana"); 
        System.out.println("Vector before removal: " + vector);

        boolean removed = vector.removeAll(java.util.Collections.singleton("Banana")); 
        
        if (removed) {
            System.out.println("All occurrences of 'Banana' removed successfully");
        } else {
            System.out.println("Element 'Banana' not found in the Vector");
        }

        System.out.println("Vector after removal: " + vector);
    }
}
