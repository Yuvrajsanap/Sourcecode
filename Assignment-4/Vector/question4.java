import java.util.Vector;

public class question4 {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(10);
        vector.add(20);
        vector.add(30);
        
        System.out.println("Before setSize - Vector: " + vector);
        System.out.println("Before setSize - Size of the Vector: " + vector.size());
        
        vector.setSize(5); 
        
        System.out.println("After setSize - Vector: " + vector);
        System.out.println("After setSize - Size of the Vector: " + vector.size());
    }
}
