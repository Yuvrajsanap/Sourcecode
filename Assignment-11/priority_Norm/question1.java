public class question1 extends Thread {
    private int[] array;
    private String threadName;

    public question1(String threadName, int[] array) {
        this.threadName = threadName;
        this.array = array;
    }

    public void run() {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        System.out.println(threadName + " (Priority: " + getPriority() + ") - Sum: " + sum);
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        question1 normPriorityThread = new question1("NormPriorityThread", array);

        normPriorityThread.setPriority(Thread.NORM_PRIORITY);
        normPriorityThread.start();
    }
}
