// remove method 

import java.util.HashSet;

public class question6{
  public static void main(String[] args) {
    HashSet<String> colors = new HashSet<>();
   
    colors.add("Red");
    colors.add("Green");
    colors.add("Blue");

    System.out.println("Colors before removal: " + colors);

    // Remove an element using remove()
    boolean removedBlue = colors.remove("Blue");

    System.out.println("Colors after removing 'Blue': " + colors);
    System.out.println("'Blue' removed: " + removedBlue);

  }
}
