public class question2 extends Thread {
    public void run() {
        if (Thread.currentThread().isDaemon()) {
            System.out.println("Daemon thread is running");
        } else {
            System.out.println("User thread is running");
        }
    }

    public static void main(String[] args) {
        question2 daemonThread = new question2();
        question2 userThread = new question2();

        daemonThread.setDaemon(true);
        daemonThread.start();
        userThread.start();
    }
}
