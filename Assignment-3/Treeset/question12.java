import java.util.TreeSet;

public class question12{
    public static void main(String[] args) {
        
        TreeSet<Integer> set = new TreeSet<>();
        set.add(5);
        set.add(2);
        set.add(8);

        System.out.println("TreeSet before removal: " + set);

        boolean removed = set.remove(2);

        System.out.println("Was 2 removed? " + removed);

        System.out.println("TreeSet after removal: " + set);
    }
}
