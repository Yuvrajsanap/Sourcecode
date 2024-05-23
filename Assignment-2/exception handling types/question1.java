//nullpointer exception(cheack)

public class question1 {
    public static void main(String[] args) {
        String name = null; 

        try {
            System.out.println("Hello, " + name.toUpperCase()); 
        } 
        catch (NullPointerException e) 
        {
            System.out.println("Error: Name cannot be null.");
            System.out.println("Exception message: " + e.getMessage());
        }
    }
}
