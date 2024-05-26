import java.util.ArrayList;
import java.util.TreeSet;

public class question2{

  public static void main(String[] args) {

    TreeSet<String> colors = new TreeSet<>();

    ArrayList<String> colorList = new ArrayList<>();
    colorList.add("Red");
    colorList.add("Green");
    colorList.add("Blue");


    boolean allAdded = colors.addAll(colorList);

    System.out.println("Elements in the TreeSet (sorted): " + colors);
    System.out.println("Were all elements added? " + allAdded);
  }
}
