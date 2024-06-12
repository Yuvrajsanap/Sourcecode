import java.io.CharArrayReader;
import java.io.IOException;

public class question3 {

    public static void main(String[] args) {
        String data = "Hello, CharArrayReader!";
        char[] charArray = data.toCharArray();

        try (CharArrayReader car = new CharArrayReader(charArray)) {
            for (int ch; (ch = car.read()) != -1;) {
                System.out.print((char) ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
