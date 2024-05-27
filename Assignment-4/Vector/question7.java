import java.util.Vector;

public class question7 {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(10);
        vector.add(20);
        vector.add(30);
        
        System.out.println("Vector: " + vector);
        
        int index = 1; 
        Integer element = vector.elementAt(index); 
        
        System.out.println("Element at index " + index + ": " + element);
    }
}
