import java.io.ByteArrayInputStream;
import java.io.IOException;

public class question6 {

    public static void main(String[] args) {
        String data = "Hello, StringBufferInputStream!";
        byte[] bytes = data.getBytes();

        try (ByteArrayInputStream bais = new ByteArrayInputStream(bytes)) {
            int content;
            while ((content = bais.read()) != -1) {
                System.out.print((char) content);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
