import java.util.Vector;

public class question10 {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Orange");

        int index = 1; 
        String elementAtIndex = vector.get(index);
        System.out.println("Element at index " + index + ": " + elementAtIndex);
    }
}
