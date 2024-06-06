public class question4 extends Thread {
    private static final Object lock = new Object();

    public void run() {
        synchronized (lock) {
            System.out.println("MAX_PRIORITY Thread is accessing the resource.");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("MAX_PRIORITY Thread finished accessing the resource.");
        }
    }

    public static void main(String[] args) {
        question4 maxPriorityThread = new question4();
        question4 normPriorityThread = new question4();

        maxPriorityThread.setPriority(Thread.MAX_PRIORITY);
        normPriorityThread.setPriority(Thread.NORM_PRIORITY);

        maxPriorityThread.start();
        normPriorityThread.start();
    }
}
