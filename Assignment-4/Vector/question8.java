import java.util.Vector;

public class question8 {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Orange");

        String firstElement = vector.firstElement(); 
        System.out.println("First Element: " + firstElement);
    }
}
