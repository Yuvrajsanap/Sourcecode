import java.util.HashSet;

public class question2 {

  public static void main(String[] args) {

    HashSet<String> colors = new HashSet<>();

    // Add elements
    colors.add("Red");
    colors.add("Green");
    colors.add("Blue");

    System.out.println("Colors before clearing: " + colors);

    // Remove all elements using clear()
    colors.clear();

    System.out.println("Colors after clearing: " + colors);
  }
}