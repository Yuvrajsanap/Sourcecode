public class question2 extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("MAX_PRIORITY Thread: " + i);
        }
    }

    public static void main(String[] args) {
        question2 maxPriorityThread = new question2();
        maxPriorityThread.setPriority(Thread.MAX_PRIORITY);
        maxPriorityThread.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread: " + i);
        }
    }
}
