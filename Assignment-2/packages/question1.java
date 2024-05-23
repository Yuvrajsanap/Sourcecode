import java.util.ArrayList;

public class question1 {
    private ArrayList<String> items = new ArrayList<>();

    public void addItem(String item) {
        items.add(item);
    }

    public void printItems() {
        for (String item : items) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        question1 cart = new question1();
        cart.addItem("Apples");
        cart.addItem("Bread");
        cart.addItem("Milk");
        cart.printItems();
     }
}