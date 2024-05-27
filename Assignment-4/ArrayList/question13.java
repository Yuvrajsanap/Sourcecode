import java.util.ArrayList;

public class question13 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        System.out.println("ArrayList before removing range: " + arrayList);

        int fromIndex = 1;
        int toIndex = 4;
        arrayList.subList(fromIndex, toIndex).clear();

        System.out.println("ArrayList after removing range: " + arrayList);
    }
}

