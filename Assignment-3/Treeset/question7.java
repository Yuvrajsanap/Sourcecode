import java.util.TreeSet;

public class question7 {

  public static void main(String[] args) {
    
    TreeSet<String> fruits = new TreeSet<>();

    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Orange");

    String firstFruit = fruits.first();

    System.out.println("First fruit in the TreeSet: " + firstFruit);
  }
}
