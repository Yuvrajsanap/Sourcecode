import java.util.LinkedList;
import java.util.Arrays;

public class question3 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>(Arrays.asList("Apple", "Banana"));
        LinkedList<String> elementsToAdd = new LinkedList<>(Arrays.asList("Orange", "Grapes"));

        boolean addedAll = linkedList.addAll(elementsToAdd);

        System.out.println(addedAll ? "All elements added successfully" : "Failed to add elements");
        System.out.println("LinkedList after adding elements: " + linkedList);
    }
}
