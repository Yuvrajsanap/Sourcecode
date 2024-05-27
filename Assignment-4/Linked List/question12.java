import java.util.LinkedList;

public class question12 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        String lastElement = linkedList.getLast();
        System.out.println("Last Element: " + lastElement);
    }
}
