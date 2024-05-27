import java.util.Vector;

public class question14{
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(10);
        vector.add(20);
        vector.add(30);

        System.out.println("Vector before setting element: " + vector);

        int index = 1; 
        int newValue = 25; 
        vector.set(index, newValue);

        System.out.println("Vector after setting element: " + vector);
    }
}
