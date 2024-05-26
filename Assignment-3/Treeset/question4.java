import java.util.TreeSet;

public class question4 {
    public static void main(String[] args) {
     
        TreeSet<String> originalSet = new TreeSet<>();
        originalSet.add("Apple");
        originalSet.add("Banana");
        originalSet.add("Cherry");

        // Clone the TreeSet
        TreeSet<String> clonedSet = (TreeSet<String>) originalSet.clone();

        // Display the original and cloned sets
        System.out.println("Original set: " + originalSet);
        System.out.println("Cloned set: " + clonedSet);
    }
}
