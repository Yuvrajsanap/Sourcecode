import java.util.Vector;

public class question12{
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Orange");

        boolean removed = vector.remove("Banana"); // Remove "Banana" from the Vector
        
        if (removed) {
            System.out.println("Element removed successfully");
            System.out.println("Vector after removal: " + vector);
        } else {
            System.out.println("Element not found in the Vector");
        }
    }
}
