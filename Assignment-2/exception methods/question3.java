//finally exception

public class question3{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        try {
            int num = arr[5];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Index out of bounds.");
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}

