//final exception

public class question2 {
    public static void main(String[] args) {
        String numberString = "hello";
        try {
            int number = Integer.parseInt(numberString);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format.");
        }
    }
}
