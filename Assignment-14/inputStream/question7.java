import java.io.*;

public class question7 {

    public static void main(String[] args) {
        String filename = "example.txt";

        try (FileInputStream fis = new FileInputStream(filename);
             FilterInputStream filterInputStream = new BufferedInputStream(fis)) {
            int content;
            while ((content = filterInputStream.read()) != -1) {
                System.out.print((char) content);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
