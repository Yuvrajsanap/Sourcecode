public class question2{
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            System.out.println("Thread-1 is running");
        }, "Thread-1");

        Thread thread2 = new Thread(() -> {
            System.out.println("Thread-2 is running");
        }, "Thread-2");

        thread1.start();
        thread2.start();

        try {
            thread1.join(); // Wait for thread1 to finish
            thread2.join(); // Wait for thread2 to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread finished waiting for both Thread-1 and Thread-2");
    }
}
