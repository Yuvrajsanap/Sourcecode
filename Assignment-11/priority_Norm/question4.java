public class question4 extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " with priority " + Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        question4 minPriorityThread = new question4();
        question4 normPriorityThread = new question4();
        question4 maxPriorityThread = new question4();

        minPriorityThread.setPriority(Thread.MIN_PRIORITY);
        normPriorityThread.setPriority(Thread.NORM_PRIORITY);
        maxPriorityThread.setPriority(Thread.MAX_PRIORITY);

        minPriorityThread.start();
        normPriorityThread.start();
        maxPriorityThread.start();
    }
}
