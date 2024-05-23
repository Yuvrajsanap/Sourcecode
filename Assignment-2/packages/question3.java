import java.net.URL;

public class question3 {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://www.example.com");
        System.out.println("Website exists: " + url.openConnection().getContent() != null);
    }
}