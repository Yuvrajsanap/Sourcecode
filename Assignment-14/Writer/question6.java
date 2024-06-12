import java.io.*;

class UppercaseFilterWriter extends FilterWriter {
    protected UppercaseFilterWriter(Writer out) {
        super(out);
    }

    @Override
    public void write(int c) throws IOException {
        super.write(Character.toUpperCase(c));
    }
}

public class question6 {

    public static void main(String[] args) {
        String data = "Hello, FilterWriter!";
        
        try (UppercaseFilterWriter writer = new UppercaseFilterWriter(new FileWriter("output.txt"))) {
            writer.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
