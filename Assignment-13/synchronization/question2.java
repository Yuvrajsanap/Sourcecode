// daemon 
class question2 extends Thread {
    public void run() {
        while (true) {
            System.out.println("Daemon thread running.");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        question2 daemonThread = new question2();
        daemonThread.setDaemon(true);
        daemonThread.start();

        System.out.println("Main thread finished.");
    }
}
