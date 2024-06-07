public class question4 {
    private static final Object lockA = new Object();
    private static final Object lockB = new Object();

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            synchronized (lockA) {
                System.out.println("Thread 1: Holding lock A...");
                try { Thread.sleep(50); } catch (InterruptedException e) {}
                System.out.println("Thread 1: Waiting for lock B...");
                synchronized (lockB) {
                    System.out.println("Thread 1: Acquired lock A & B...");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (lockB) {
                System.out.println("Thread 2: Holding lock B...");
                try { Thread.sleep(50); } catch (InterruptedException e) {}
                System.out.println("Thread 2: Waiting for lock A...");
                synchronized (lockA) {
                    System.out.println("Thread 2: Acquired lock B & A...");
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
