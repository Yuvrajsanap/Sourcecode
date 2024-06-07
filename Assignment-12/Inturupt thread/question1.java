public class question1 {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println("Thread is running...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Thread was interrupted");
                    Thread.currentThread().interrupt(); // Preserve the interrupt status
                }
            }
        });

        thread.start();
        
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        thread.interrupt();
    }
}
