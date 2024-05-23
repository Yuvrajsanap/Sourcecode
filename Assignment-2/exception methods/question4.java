//finally exception

public class question4 {
    public static void main(String[] args) {
        int a = 10, b = 0;
        try {
            int result = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } finally {
            System.out.println("Division operation attempted.");
        }
    }
}
