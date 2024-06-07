public class question2 {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                if (Thread.currentThread().isInterrupted()) {
                    System.out.println("Thread was interrupted, exiting...");
                    break;
                }
                System.out.println("Loop iteration: " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("Thread was interrupted during sleep, exiting...");
                    Thread.currentThread().interrupt();
                    break;
                }
            }
        });

        thread.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread.interrupt();
    }
}
