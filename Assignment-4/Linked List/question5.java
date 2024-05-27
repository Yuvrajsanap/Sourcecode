import java.util.LinkedList;

public class question5{
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        System.out.println("LinkedList before adding last element: " + linkedList);

        int newValue = 4;
        linkedList.offerLast(newValue);

        System.out.println("LinkedList after adding last element: " + linkedList);
    }
}
