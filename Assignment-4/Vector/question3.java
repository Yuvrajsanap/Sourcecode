import java.util.Vector;

public class question3 {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(10);
        vector.add(20);
        vector.add(30);
        
        int size = vector.size(); 
        System.out.println("Vector: " + vector);
        System.out.println("Size of the Vector: " + size);
    }
}
