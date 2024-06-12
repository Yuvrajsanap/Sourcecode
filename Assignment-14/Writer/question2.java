import java.io.*;

public class question2 {

    public static void main(String[] args) {
        String data = "Hello, OutputStreamWriter!";
        
        try (Writer writer = new OutputStreamWriter(new FileOutputStream("output.txt"))) {
            writer.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
