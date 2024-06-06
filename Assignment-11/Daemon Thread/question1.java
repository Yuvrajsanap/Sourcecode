public class question1 extends Thread {
    public void run() {
        while (true) {
            System.out.println("Daemon thread is running");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        question1 daemonThread = new question1();
        daemonThread.setDaemon(true);
        daemonThread.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread finished");
    }
}
