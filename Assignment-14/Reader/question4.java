import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class question4 {

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
            for (String line; (line = br.readLine()) != null;) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
