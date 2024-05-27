import java.util.LinkedList;

public class question9 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        boolean containsElement = linkedList.contains("Banana");
        System.out.println("Contains 'Banana': " + containsElement);
    }
}
