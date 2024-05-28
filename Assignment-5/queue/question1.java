import java.util.LinkedList;
import java.util.Queue;

public class question1 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("Apple");
        queue.offer("Banana");
        queue.offer("Cherry");

        System.out.println("Queue after offers: " + queue);
        System.out.println("Element at the head using peek(): " + queue.peek());
        
        try {
            System.out.println("Element at the head using element(): " + queue.element());
        } catch (Exception e) {
            System.out.println("Queue is empty, cannot use element()");
        }

        System.out.println("Element removed using poll(): " + queue.poll());
        System.out.println("Queue after poll: " + queue);

        try {
            System.out.println("Element removed using remove(): " + queue.remove());
        } catch (Exception e) {
            System.out.println("Queue is empty, cannot use remove()");
        }
        System.out.println("Queue after remove: " + queue);
    }
}
