//HashSet Methods
import java.util.HashSet;
import java.util.Set;

public class question1 {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        System.out.println("HashSet after adding elements: " + fruits);
        
        fruits.add("Apple");
        System.out.println("HashSet after attempting to add duplicate element: " + fruits);

        System.out.println("HashSet contains 'Banana': " + fruits.contains("Banana"));
        System.out.println("HashSet contains 'Fig': " + fruits.contains("Fig"));

        fruits.remove("Date");
        System.out.println("HashSet after removing 'Date': " + fruits);

        System.out.println("Size of the HashSet: " + fruits.size());
        System.out.println("Is HashSet empty: " + fruits.isEmpty());

        System.out.println("Iterating through the HashSet:");
        fruits.forEach(System.out::println);

        fruits.clear();
        System.out.println("HashSet after clearing all elements: " + fruits);
        System.out.println("Is HashSet empty after clear: " + fruits.isEmpty());
    }
}
