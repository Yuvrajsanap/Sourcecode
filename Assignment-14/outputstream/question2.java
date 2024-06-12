import java.io.*;

public class question2 {

    public static void main(String[] args) {
        try (PipedOutputStream pos = new PipedOutputStream();
             PipedInputStream pis = new PipedInputStream(pos)) {

            String data = "Hello, PipedOutputStream!";
            byte[] bytes = data.getBytes();

            pos.write(bytes);

            int content;
            while ((content = pis.read()) != -1) {
                System.out.print((char) content);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
