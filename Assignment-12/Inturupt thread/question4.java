public class question4 {
    private static final Object lock = new Object();

    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            synchronized (lock) {
                try {
                    System.out.println("Thread is waiting on lock");
                    lock.wait();
                } catch (InterruptedException e) {
                    System.out.println("Thread was interrupted while waiting");
                }
            }
        });

        thread.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        synchronized (lock) {
            thread.interrupt();
        }
    }
}
