import java.util.ArrayList;
import java.util.List;

class ListAdder {
    private List<Integer> list = new ArrayList<>();

    public synchronized void addElement(int element) {
        list.add(element);
        System.out.println(Thread.currentThread().getName() + " added: " + element);
    }
}

public class question4 {
    public static void main(String[] args) {
        ListAdder listAdder = new ListAdder();

        Thread thread1 = new Thread(() -> {
            listAdder.addElement(1);
        }, "Adder-1");

        Thread thread2 = new Thread(() -> {
            listAdder.addElement(2);
        }, "Adder-2");

        thread1.start();
        thread2.start();
    }
}
