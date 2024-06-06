public class question4 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            try {
                Thread.sleep(2000); // Simulate some work
                System.out.println("Thread-1 finished work");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "Thread-1");

        thread1.start();

        try {
            thread1.join(1000); // Wait for thread1 to finish, but only for 1 second
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread finished waiting for Thread-1 (waited for 1 second)");
    }
}
