public class question4 extends Thread {
    private static final Object lock = new Object();

    public void run() {
        synchronized (lock) {
            System.out.println("MIN_PRIORITY Thread is accessing the resource.");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("MIN_PRIORITY Thread finished accessing the resource.");
        }
    }

    public static void main(String[] args) {
        question4 minPriorityThread = new question4();
        question4 normPriorityThread = new question4();

        minPriorityThread.setPriority(Thread.MIN_PRIORITY);
        normPriorityThread.setPriority(Thread.NORM_PRIORITY);

        minPriorityThread.start();
        normPriorityThread.start();
    }
}
