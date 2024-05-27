import java.util.ArrayList;
import java.util.Arrays;

public class question15 {
    public static void main(String[] args) {
       
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");

        // Convert ArrayList to array
        Object[] array = arrayList.toArray();

        System.out.println("Array elements: " + Arrays.toString(array));
    }
}
