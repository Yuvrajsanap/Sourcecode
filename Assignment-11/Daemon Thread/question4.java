public class question4 extends Thread {
    public void run() {
        while (true) {
            System.out.println("Server monitoring...");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        question4 serverThread = new question4();
        serverThread.setDaemon(true);
        serverThread.start();

        System.out.println("Server started. Main thread simulating server load.");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread finished. Server will stop.");
    }
}
