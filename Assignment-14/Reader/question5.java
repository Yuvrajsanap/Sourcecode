import java.io.StringReader;
import java.io.IOException;

public class question5 {

    public static void main(String[] args) {
        String data = "Hello, StringReader!";

        try (StringReader sr = new StringReader(data)) {
            for (int ch; (ch = sr.read()) != -1;) {
                System.out.print((char) ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
