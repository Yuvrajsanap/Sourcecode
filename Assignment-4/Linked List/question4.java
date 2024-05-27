//addFirst

import java.util.LinkedList;

public class question4 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(2);
        linkedList.add(3);

        System.out.println("LinkedList before adding first: " + linkedList);

        linkedList.addFirst(1);

        System.out.println("LinkedList after adding first: " + linkedList);
    }
}
