import java.util.ArrayList;

public class question16 {
    public static void main(String[] args) {
       
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("Before trimToSize: " + list);

        // Trim the ArrayList to its current size
        list.trimToSize();

        System.out.println("After trimToSize: " + list);
    }
}
