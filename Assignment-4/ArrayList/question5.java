import java.util.ArrayList;

public class question5 {

  public static void main(String[] args) {
    ArrayList<String> namesList = new ArrayList<>();
    namesList.add("Alice");
    namesList.add("Bob");
    namesList.add("Charlie");

    System.out.println("Names List (Before Clear): " + namesList);

    namesList.clear();

    System.out.println("Names List (After Clear): " + namesList);
  }
}
