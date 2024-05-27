import java.util.ArrayList;

public class question11 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(10);
        list.add(40);
        list.add(10);

        int lastIndex = list.lastIndexOf(10);
        System.out.println("Last index of 10: " + lastIndex);

        lastIndex = list.lastIndexOf(20);
        System.out.println("Last index of 20: " + lastIndex);

        lastIndex = list.lastIndexOf(30);
        System.out.println("Last index of 30: " + lastIndex);

        lastIndex = list.lastIndexOf(50);
        System.out.println("Last index of 50: " + lastIndex);
    }
}
