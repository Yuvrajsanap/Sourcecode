public class question3 extends Thread {
    public void run() {
        System.out.println("Thread with NORM_PRIORITY is running.");
    }

    public static void main(String[] args) {
        question3 normPriorityThread = new question3();
        normPriorityThread.setPriority(Thread.NORM_PRIORITY);
        normPriorityThread.start();
    }
}
