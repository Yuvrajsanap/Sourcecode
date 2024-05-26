import java.util.LinkedHashSet;

public class question5{

  public static void main(String[] args) {
   
    LinkedHashSet<String> names = new LinkedHashSet<>();

    // Check if the set is empty
    boolean isEmpty = names.isEmpty();

    System.out.println("Is the set empty? " + isEmpty);

    names.add("Yuvraj");
    names.add("om");

    isEmpty = names.isEmpty();

    System.out.println("Is the set empty after adding elements? " + isEmpty);
  }
}
