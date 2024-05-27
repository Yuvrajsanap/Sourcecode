import java.util.LinkedList;

public class question21 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        Object[] array = linkedList.toArray();

        System.out.println("Elements of the array:");
        for (Object element : array) {
            System.out.println(element);
        }
    }
}
