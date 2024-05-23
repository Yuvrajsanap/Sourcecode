//error exception

public class question5{
    public static void main(String[] args) {
        String numberString = "hello"; 

        try {
            int number = Integer.parseInt(numberString);  
            System.out.println("Converted number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Error: Could not convert string to a number.");
            System.out.println("Reason: " + e.getMessage());  //error message
        }
    }
}
