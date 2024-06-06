public class question3 extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("MAX_PRIORITY Thread: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        question3 maxPriorityThread = new question3();
        maxPriorityThread.setPriority(Thread.MAX_PRIORITY);
        maxPriorityThread.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
