public class question1 extends Thread {
    public void run() {
        System.out.println("Thread with MAX_PRIORITY is running.");
    }

    public static void main(String[] args) {
        question1 maxPriorityThread = new question1();
        maxPriorityThread.setPriority(Thread.MAX_PRIORITY);
        maxPriorityThread.start();
    }
}
