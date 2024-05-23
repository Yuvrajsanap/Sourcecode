//final exception

public class question1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        try {
            System.out.println(numbers[4]); 
        } catch (Exception e) { 
            System.out.println("Error: Index out of bounds.");
        }
    }
}
