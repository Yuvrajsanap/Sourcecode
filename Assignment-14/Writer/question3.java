import java.io.*;

public class question3 {

    public static void main(String[] args) {
        String data = "Hello, CharArrayWriter!";
        
        try (CharArrayWriter writer = new CharArrayWriter()) {
            writer.write(data);
            System.out.println(writer.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
