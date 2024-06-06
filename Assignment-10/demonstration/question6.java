class Counter {
    private int count = 0;
    public synchronized void increment() throws InterruptedException {
        while (count != 0) wait();
        count++;
        System.out.println("Incremented: " + count);
        notify();
    }
    public synchronized void decrement() throws InterruptedException {
        while (count == 0) wait();
        count--;
        System.out.println("Decremented: " + count);
        notify();
    }
}

public class question6{
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Thread incThread = new Thread(() -> { for (int i = 0; i < 5; i++) try { counter.increment(); } catch (InterruptedException e) { e.printStackTrace(); } });
        Thread decThread = new Thread(() -> { for (int i = 0; i < 5; i++) try { counter.decrement(); } catch (InterruptedException e) { e.printStackTrace(); } });
        incThread.start(); decThread.start(); incThread.join(); decThread.join();
    }
}
