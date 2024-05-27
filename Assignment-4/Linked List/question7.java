import java.util.LinkedList;

public class question7<E> extends LinkedList<E> {
    public E removeLast() {
        if (isEmpty()) return null;
        return remove(size() - 1);
    }

    public static void main(String[] args) {
        question7<Integer> list = new question7<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("List before removeLast: " + list);
        Integer removed = list.removeLast();
        System.out.println("Removed element: " + removed);
        System.out.println("List after removeLast: " + list);
    }
}
