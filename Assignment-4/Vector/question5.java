import java.util.Vector;

public class question5{
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(10);
        vector.add(20);
        vector.add(30);
        
        System.out.println("Vector: " + vector);
        
        int elementToCheck = 20;
        boolean containsElement = vector.contains(elementToCheck); 
        
        if (containsElement) {
            System.out.println("Vector contains element " + elementToCheck);
        } else {
            System.out.println("Vector does not contain element " + elementToCheck);
        }
    }
}
