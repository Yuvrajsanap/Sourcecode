import java.util.LinkedList;

public class question19 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        System.out.println("LinkedList before setting element: " + linkedList);
        
        int index = 1; 
        String newValue = "Grapes"; 
        linkedList.set(index, newValue);

        System.out.println("LinkedList after setting element: " + linkedList);
    }
}
