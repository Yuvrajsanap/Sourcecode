public class question2 extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("NORM_PRIORITY Thread: " + i);
        }
    }

    public static void main(String[] args) {
        question2 normPriorityThread = new question2();
        normPriorityThread.setPriority(Thread.NORM_PRIORITY);
        normPriorityThread.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread: " + i);
        }
    }
}
