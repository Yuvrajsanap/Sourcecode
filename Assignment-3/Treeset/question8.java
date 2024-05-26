// sorted Headset method

import java.util.SortedSet;
import java.util.TreeSet;

public class question8{

  public static void main(String[] args) {
    
    TreeSet<String> fruits = new TreeSet<>();

    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Orange");
    fruits.add("Mango");

    SortedSet<String> beforeOrange = fruits.headSet("Orange");

    System.out.println("Fruits before 'Orange' (sorted subset): " + beforeOrange);
  }
}
