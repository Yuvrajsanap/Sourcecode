import java.util.ArrayList;
import java.util.Collection;

public class question4 {
    private ArrayList<Object> elements = new ArrayList<>();

    public boolean addAll(int index, Collection<?> c) {
        return elements.addAll(index, c);
    }

    public static void main(String[] args) {
        question4 list = new question4();
        list.elements.add("Apple");
        list.elements.add("Banana");
        
        Collection<String> fruits = new ArrayList<>();
        fruits.add("Orange");
        fruits.add("Grapes");
        
        boolean result = list.addAll(1, fruits);
        
        System.out.println("Elements added successfully: " + result);
        System.out.println("List contents: " + list.elements);
    }
}
