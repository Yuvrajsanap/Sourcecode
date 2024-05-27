import java.util.ArrayList;

public class question7 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        System.out.println("List contains 'Apple': " + list.contains("Apple"));
        System.out.println("List contains 'Grapes': " + list.contains("Grapes"));
    }
}
