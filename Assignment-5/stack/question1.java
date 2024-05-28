import java.util.Stack;

public class question1 {

    private Stack<Integer> stack = new Stack<>();

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public Integer peek() {
        return stack.isEmpty() ? null : stack.peek();
    }

    public Integer pop() {
        return stack.isEmpty() ? null : stack.pop();
    }

    public void push(Integer element) {
        stack.push(element);
    }

    public int search(Integer element) {
        return stack.search(element);
    }

    public static void main(String[] args) {
        question1 stackExample = new question1();

        stackExample.push(1);
        stackExample.push(2);
        stackExample.push(3);

        System.out.println("Peek: " + stackExample.peek()); 
        System.out.println("Pop: " + stackExample.pop()); 
        System.out.println("Search 2: " + stackExample.search(2)); 
        System.out.println("Search 3: " + stackExample.search(3)); 
        System.out.println("Is empty: " + stackExample.isEmpty());

        stackExample.pop();
        stackExample.pop();

        System.out.println("Is empty: " + stackExample.isEmpty()); 
    }
}
