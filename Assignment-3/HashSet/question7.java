// size method 

import java.util.HashSet;

public class question7 {

  public static void main(String[] args) {
  
    HashSet<String> fruits = new HashSet<>();

    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Orange");

    // Get the number of elements using size()
    int numberOfFruits = fruits.size();

    System.out.println("Number of elements in the HashSet: " + numberOfFruits);
  }
}
