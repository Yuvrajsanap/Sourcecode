import java.io.*;

public class question4 {

    public static void main(String[] args) {
        String data = "Hello, BufferedWriter!";
        
        try (Writer writer = new BufferedWriter(new FileWriter("output.txt"))) {
            writer.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
