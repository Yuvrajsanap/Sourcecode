import java.io.FileOutputStream;
import java.io.IOException;

public class question1 {

    public static void main(String[] args) {
        String filename = "output.txt";
        String data = "Hello, FileOutputStream!";
        
        try (FileOutputStream fos = new FileOutputStream(filename)) {
            byte[] bytes = data.getBytes();
            fos.write(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
