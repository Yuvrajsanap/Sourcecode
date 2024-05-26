// remove method 

import java.util.LinkedHashSet;

public class question7{
  public static void main(String[] args) {
   
    LinkedHashSet<String> fruits = new LinkedHashSet<>();

    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Orange");

    // Remove an element
    fruits.remove("Banana"); 

    System.out.println("Fruits after removing 'Banana': " + fruits);
  }
}
