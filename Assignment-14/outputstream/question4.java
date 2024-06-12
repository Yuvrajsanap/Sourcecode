import java.io.*;

public class question4 {

    public static void main(String[] args) {
        String filename = "object.dat";

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            String message = "Hello, ObjectOutputStream!";
            oos.writeObject(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
