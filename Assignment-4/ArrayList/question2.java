//boolean add

import java.util.Arrays;

public class question2 {
    private Object[] elements = new Object[10];
    private int size = 0;

    public boolean add(Object element) {
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, size * 2);
        }
        elements[size++] = element;
        return true;
    }

    public static void main(String[] args) {
        question2 list = new question2();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        
        System.out.println("List contents: " + Arrays.toString(Arrays.copyOf(list.elements, list.size)));
    }
}
