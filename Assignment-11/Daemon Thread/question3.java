public class question3 extends Thread {
    public void run() {
        try {
            while (true) {
                System.out.println("Cleaning resources...");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        question3 cleaner = new question3();
        cleaner.setDaemon(true);
        cleaner.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread finished");
    }
}
