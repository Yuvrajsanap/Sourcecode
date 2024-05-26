// clear method 

import java.util.TreeSet;

public class question3{

  public static void main(String[] args) {
    
    TreeSet<String> fruits = new TreeSet<>();

    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Orange");

    System.out.println("Fruits before clearing: " + fruits);

    // Clear the TreeSet
    fruits.clear();

    System.out.println("Fruits after clearing: " + fruits);
    System.out.println("Is the set empty? " + fruits.isEmpty());
  }
}
