import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class question2 {
    public static void main(String[] args) throws IOException {
        File file = new File("data.txt");
        FileWriter writer = new FileWriter(file);
        writer.write("This is some data to write to a file.\n");
        writer.close();
        System.out.println("Data written to file: " + file.getAbsolutePath());
    }
}