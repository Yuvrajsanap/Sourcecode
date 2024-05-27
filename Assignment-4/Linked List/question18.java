import java.util.LinkedList;

public class question18 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(20); 
        linkedList.add(30);

        System.out.println("LinkedList before removal: " + linkedList);
        
        Integer elementToRemove = 20;
        boolean removed = linkedList.removeLastOccurrence(elementToRemove);

        if (removed) {
            System.out.println("Last occurrence of element " + elementToRemove + " removed successfully");
            System.out.println("LinkedList after removal: " + linkedList);
        } else {
            System.out.println("Element " + elementToRemove + " not found in the LinkedList");
        }
    }
}
