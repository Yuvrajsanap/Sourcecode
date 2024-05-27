import java.util.Vector;

public class question11 {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Orange");

        boolean empty = vector.isEmpty(); 
        
        System.out.println("Vector is empty: " + empty);
    }
}
