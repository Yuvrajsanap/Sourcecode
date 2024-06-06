public class question2 extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("MIN_PRIORITY Thread: " + i);
        }
    }

    public static void main(String[] args) {
        question2 minPriorityThread = new question2();
        minPriorityThread.setPriority(Thread.MIN_PRIORITY);
        minPriorityThread.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread: " + i);
        }
    }
}
