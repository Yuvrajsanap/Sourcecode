import java.io.*;

public class question5 {

    public static void main(String[] args) {
        String data = "Hello, StringWriter!";
        
        try (StringWriter writer = new StringWriter()) {
            writer.write(data);
            String result = writer.toString();
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
