import java.io.*;

public class question2 {

    public static void main(String[] args) {
        try (InputStreamReader isr = new InputStreamReader(new FileInputStream("input.txt"))) {
            for (int data; (data = isr.read()) != -1;) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
