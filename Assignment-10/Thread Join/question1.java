public class question1{
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            System.out.println("Thread-1 is running");
        }, "Thread-1");

        thread1.start();

        try {
            thread1.join(); // Wait for thread1 to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread finished waiting for Thread-1");
    }
}
