import java.io.*;

public class question7 {

    public static void main(String[] args) {
        String data = "Hello, PrintWriter!";
        
        try (PrintWriter writer = new PrintWriter(new FileWriter("output.txt"))) {
            writer.print(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
