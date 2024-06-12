import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class question2 {

    public static void main(String[] args) throws IOException {
        PipedOutputStream pos = new PipedOutputStream();
        PipedInputStream pis = new PipedInputStream(pos);

        new Thread(() -> {
            try {
                pos.write("Hello, Piped Streams!".getBytes());
                pos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();

        int content;
        while ((content = pis.read()) != -1) {
            System.out.print((char) content);
        }
        pis.close();
    }
}
