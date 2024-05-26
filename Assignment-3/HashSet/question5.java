// Iterator method

import java.util.HashSet;
import java.util.Iterator;

public class question5{
  public static void main(String[] args) {

    HashSet<String> cities = new HashSet<>();

    cities.add("London");
    cities.add("Tokyo");
    cities.add("New York");

    // Get an iterator
    Iterator<String> iterator = cities.iterator();

    // Iterate using hasNext() and next()
    System.out.println("Elements in the HashSet:");
    while (iterator.hasNext()) {
      String city = iterator.next();
      System.out.println(city);
    }
  }
}
