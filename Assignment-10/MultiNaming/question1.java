class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
        System.out.println(Thread.currentThread().getName() + " incremented counter to: " + count);
    }
}

public class question1 {
    public static void main(String[] args) {
        Counter counter = new Counter();

        Thread thread1 = new Thread(() -> {
            counter.increment();
        }, "Thread-A");

        Thread thread2 = new Thread(() -> {
            counter.increment();
        }, "Thread-B");

        thread1.start();
        thread2.start();
    }
}
