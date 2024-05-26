import java.util.LinkedHashSet;

public class question4 {

  public static void main(String[] args) {
    
    LinkedHashSet<String> colors = new LinkedHashSet<>();

    colors.add("Red");
    colors.add("Green");
    colors.add("Blue");

    // Check if elements exist
    boolean containsRed = colors.contains("Red");
    boolean containsYellow = colors.contains("Yellow");

    System.out.println("Does the set contain 'Red'? " + containsRed);
    System.out.println("Does the set contain 'Yellow'? " + containsYellow);
  }
}
