import java.util.LinkedList;

public class question11 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        String firstElement = linkedList.getFirst();
        System.out.println("First Element: " + firstElement);
    }
}
