import java.util.ArrayList;

public class question8 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        System.out.println("Current Capacity: " + arrayList.size());

        int newCapacity = 10;
        ensureCapacity(arrayList, newCapacity);

        System.out.println("Capacity after ensureCapacity: " + arrayList.size());
    }

    public static <T> void ensureCapacity(ArrayList<T> arrayList, int capacity) {
        arrayList.ensureCapacity(capacity);
    }
}

