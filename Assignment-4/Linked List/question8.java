import java.util.LinkedList;

public class question8 {
    public static void main(String[] args) {
        LinkedList<Integer> originalList = new LinkedList<>();
        originalList.add(1);
        originalList.add(2);
        originalList.add(3);

        LinkedList<Integer> clonedList = (LinkedList<Integer>) originalList.clone();

        System.out.println("Original LinkedList: " + originalList);
        System.out.println("Cloned LinkedList: " + clonedList);
    }
}
