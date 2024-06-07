public class question3 {
    private static final Object resource1 = new Object();
    private static final Object resource2 = new Object();

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread 1: Acquired resource 1");
                try { Thread.sleep(50); } catch (InterruptedException e) {}
                synchronized (resource2) {
                    System.out.println("Thread 1: Acquired resource 2");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (resource1) {  // Changed to resource1 first
                System.out.println("Thread 2: Acquired resource 1");
                try { Thread.sleep(50); } catch (InterruptedException e) {}
                synchronized (resource2) {
                    System.out.println("Thread 2: Acquired resource 2");
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
