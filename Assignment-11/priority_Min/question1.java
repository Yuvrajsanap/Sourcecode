public class question1 extends Thread {
    public void run() {
        System.out.println("Thread with MIN_PRIORITY is running.");
    }

    public static void main(String[] args) {
        question1 minPriorityThread = new question1();
        minPriorityThread.setPriority(Thread.MIN_PRIORITY);
        minPriorityThread.start();
    }
}
