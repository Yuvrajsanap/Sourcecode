import java.util.Iterator;
import java.util.TreeSet;

public class question10{

  public static void main(String[] args) {
    
    TreeSet<String> fruits = new TreeSet<>();

    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Orange");

    Iterator<String> iterator = fruits.iterator();

    System.out.println("Fruits in the TreeSet (using iterator):");
    while (iterator.hasNext()) {
      String fruit = iterator.next();
      System.out.println(fruit);
      }
    }
  }
