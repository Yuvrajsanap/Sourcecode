// size method 

import java.util.LinkedHashSet;

public class question8 {

  public static void main(String[] args) {
    
    LinkedHashSet<String> colors = new LinkedHashSet<>();

    colors.add("Red");
    colors.add("Green");
    colors.add("Blue");

    int numColors = colors.size();

    System.out.println("Number of colors in the set: " + numColors);
  }
}
