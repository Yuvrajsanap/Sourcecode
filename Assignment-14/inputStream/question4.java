import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class question4 {

    public static void main(String[] args) throws IOException {
        ByteArrayInputStream input1 = new ByteArrayInputStream("Hello, ".getBytes());
        ByteArrayInputStream input2 = new ByteArrayInputStream("SequenceInputStream!".getBytes());

        try (SequenceInputStream sis = new SequenceInputStream(input1, input2)) {
            int content;
            while ((content = sis.read()) != -1) {
                System.out.print((char) content);
            }
        }
    }
}
