public class question14 {
    private Object[] elements = new Object[10];
    private int size = 0;

    protected int size() {
        return size;
    }

    public void add(Object element) {
        if (size == elements.length) {
            Object[] newElements = new Object[size * 2];
            System.arraycopy(elements, 0, newElements, 0, size);
            elements = newElements;
        }
        elements[size++] = element;
    }

    public static void main(String[] args) {
        question14 list = new question14();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        System.out.println("Size of the list: " + list.size());
    }
}
