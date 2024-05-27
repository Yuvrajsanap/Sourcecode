import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class question3 {
    public static void main(String[] args) {
   
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");

        Collection<String> moreFruits = Arrays.asList("Orange", "Grapes");

        boolean result = fruits.addAll(moreFruits);

        System.out.println("Elements added successfully: " + result);

        System.out.println("ArrayList contents: " + fruits);
    }
}
