import java.util.LinkedHashSet;

public class question3 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> originalSet = new LinkedHashSet<>();
        originalSet.add(1);
        originalSet.add(2);
        originalSet.add(3);

        // Clone the LinkedHashSet
        LinkedHashSet<Integer> clonedSet = (LinkedHashSet<Integer>) originalSet.clone();

        System.out.println("Original set: " + originalSet);
        System.out.println("Cloned set: " + clonedSet);
    }
}
