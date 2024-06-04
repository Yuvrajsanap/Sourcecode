public class question4{
    public static void main(String[] args) {
        int start = 10;

        Thread countdownThread = new Thread() {
            public void run() {
                try {
                    for (int i = start; i >= 0; i--) {
                        System.out.println("Countdown: " + i);
                        Thread.sleep(1000); 
                    }
                    System.out.println("Time's up!");
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        };

        countdownThread.start();
    }
}
