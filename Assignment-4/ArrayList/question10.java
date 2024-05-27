import java.util.ArrayList;

public class question10 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        int indexBanana = list.indexOf("Banana");
        int indexGrapes = list.indexOf("Grapes");
        int indexApple = list.indexOf("Apple");

        System.out.println("Index of 'Banana': " + indexBanana);
        System.out.println("Index of 'Grapes': " + indexGrapes);
        System.out.println("Index of 'Apple': " + indexApple);
    }
}
