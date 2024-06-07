public class question4 {
    private static final Object lock1 = new Object();
    private static final Object lock2 = new Object();
    private static int number = 0;

    public static void main(String[] args) {
        Thread incrementThread = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("IncrementThread: Holding lock 1...");
                try { Thread.sleep(50); } catch (InterruptedException e) {}
                synchronized (lock2) {
                    number++;
                    System.out.println("IncrementThread: Incremented number to " + number);
                }
            }
        });

        Thread decrementThread = new Thread(() -> {
            synchronized (lock2) {
                System.out.println("DecrementThread: Holding lock 2...");
                try { Thread.sleep(50); } catch (InterruptedException e) {}
                synchronized (lock1) {
                    number--;
                    System.out.println("DecrementThread: Decremented number to " + number);
                }
            }
        });

        incrementThread.start();
        decrementThread.start();
    }
}
