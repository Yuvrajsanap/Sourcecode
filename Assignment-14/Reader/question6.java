import java.io.*;

class UpperCaseFilterReader extends FilterReader {
    protected UpperCaseFilterReader(Reader in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int ch = super.read();
        return (ch == -1) ? ch : Character.toUpperCase(ch);
    }
}

public class question6 {
    public static void main(String[] args) {
        String data = "Hello, FilterReader!";
        try (Reader sr = new StringReader(data);
             UpperCaseFilterReader ufr = new UpperCaseFilterReader(sr)) {
            for (int ch; (ch = ufr.read()) != -1;) {
                System.out.print((char) ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
