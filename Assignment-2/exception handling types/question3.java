//throw an ArrayIndexOutOfBoundsException (unchecked)

public class question3 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};

        try {
            System.out.println("Element at index 4: " + numbers[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds.");  
        }
    }
}
