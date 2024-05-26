import java.util.TreeSet;

public class question6{

  public static void main(String[] args) {
    
    TreeSet<String> colors = new TreeSet<>();

    colors.add("Red");
    colors.add("Green");
    colors.add("Blue");

    boolean hasBlue = colors.contains("Blue");

    System.out.println("Does the TreeSet contain 'Blue'? " + hasBlue);
  }
}
