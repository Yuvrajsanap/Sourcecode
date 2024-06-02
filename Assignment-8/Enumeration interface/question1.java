import java.util.Enumeration;
import java.util.Vector;

public class question1{
    public static void main(String[] args) {
        Vector<Integer> numbers = new Vector<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        // Display elements using Enumeration
        displayElements(numbers.elements());

        // Add elements
        numbers.add(5);
        numbers.add(6);
        System.out.println("\nAfter adding elements:");
        displayElements(numbers.elements());

        // Remove elements
        numbers.removeElement(1);
        numbers.removeElement(6);
        System.out.println("\nAfter removing elements:");
        displayElements(numbers.elements());
    }

    private static void displayElements(Enumeration<Integer> enumeration) {
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}
