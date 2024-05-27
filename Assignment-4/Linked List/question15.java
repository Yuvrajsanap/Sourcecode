import java.util.LinkedList;

public class question15 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Banana"); 

        String objectToRemove = "Banana";
        boolean removed = linkedList.remove(objectToRemove);

        System.out.println(removed ? "Object '" + objectToRemove + "' removed successfully" : "Object '" + objectToRemove + "' not found in the LinkedList");
        System.out.println("LinkedList after removing object: " + linkedList);
    }
}
