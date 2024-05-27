import java.util.Vector;

public class question9{
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Orange");

        String lastElement = vector.lastElement(); 
        System.out.println("Last Element: " + lastElement);
    }
}
