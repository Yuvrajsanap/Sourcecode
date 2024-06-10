class question3 extends Thread {
    public void run() {
        while (true) {
            System.out.println("Daemon thread running.");
            try {
                Thread.sleep(500); // Pause for 0.5 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        question3 daemonThread = new question3();
        daemonThread.setDaemon(true); 
        daemonThread.start();

        Thread userThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("User thread running.");
                try {
                    Thread.sleep(1000); 
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("User thread finished.");
        });

        userThread.start();
    }
}
