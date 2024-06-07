public class question3 {
    private static final Object lock1 = new Object();
    private static final Object lock2 = new Object();
    private static int sum = 0;

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("Thread 1: Holding lock 1...");
                try { Thread.sleep(50); } catch (InterruptedException e) {}
                synchronized (lock2) {
                    sum += 10;
                    System.out.println("Thread 1: Holding lock 1 & 2 and adding 10 to sum. Sum = " + sum);
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (lock1) {  // Changed to lock1 first
                System.out.println("Thread 2: Holding lock 1...");
                try { Thread.sleep(50); } catch (InterruptedException e) {}
                synchronized (lock2) {
                    sum += 20;
                    System.out.println("Thread 2: Holding lock 1 & 2 and adding 20 to sum. Sum = " + sum);
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
