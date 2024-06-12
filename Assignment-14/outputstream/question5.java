import java.io.*;

public class question5 {

    public static void main(String[] args) {
        String filename = "output.txt";

        try (FileOutputStream fos = new FileOutputStream(filename);
             FilterOutputStream filterOutputStream = new BufferedOutputStream(fos)) {
            String message = "Hello, FilterOutputStream!";
            byte[] bytes = message.getBytes();
            filterOutputStream.write(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
