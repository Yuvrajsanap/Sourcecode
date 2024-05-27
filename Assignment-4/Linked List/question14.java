import java.util.LinkedList;

public class question14 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);

        int index = linkedList.lastIndexOf(20);
        System.out.println("Last Index of 20: " + index);
    }
}