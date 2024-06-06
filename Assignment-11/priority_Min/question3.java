public class question3 extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("MIN_PRIORITY Thread: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        question3 minPriorityThread = new question3();
        minPriorityThread.setPriority(Thread.MIN_PRIORITY);
        minPriorityThread.start();

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
