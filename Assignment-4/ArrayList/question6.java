import java.util.ArrayList;

public class question6 {
    public static void main(String[] args) {
        ArrayList<String> originalList = new ArrayList<>();
        originalList.add("Apple");
        originalList.add("Banana");
        originalList.add("Orange");

        ArrayList<String> clonedList = (ArrayList<String>) originalList.clone();

        System.out.println("Original List: " + originalList);
        System.out.println("Cloned List: " + clonedList);
    }
}
