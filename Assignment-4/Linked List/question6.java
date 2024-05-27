import java.util.*;

public class question6 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("Original List: " + list);

        list.clear(); 
        System.out.println("List after clearing: " + list);
    }
}
