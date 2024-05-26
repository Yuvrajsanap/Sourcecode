// isEmpty method 
import java.util.HashSet;

public class question4{

  public static void main(String[] args) {
    
    HashSet<String> numbers = new HashSet<>();

    System.out.println("Is the HashSet empty? " + numbers.isEmpty());

    numbers.add("One");
    numbers.add("Two");
    numbers.add("Three");

    System.out.println("Is the HashSet empty after adding elements? " + numbers.isEmpty());
  }
}
