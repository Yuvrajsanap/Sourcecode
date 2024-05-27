import java.util.ArrayList;

public class question12{
    public static void main(String[] args) {
      
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple");

        System.out.println("ArrayList before removal: " + fruits);

        fruits.remove("Banana");

        System.out.println("ArrayList after removing 'Banana': " + fruits);

        fruits.remove(0);

        System.out.println("ArrayList after removing element at index 0: " + fruits);
    }
}
