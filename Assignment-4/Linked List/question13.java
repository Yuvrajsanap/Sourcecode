import java.util.LinkedList;

public class question13 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        int index = linkedList.indexOf("Banana");
        System.out.println("Index of 'Banana': " + index);
    }
}
