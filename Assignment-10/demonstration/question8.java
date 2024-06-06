class Countdown {
    private int count = 5;
    public synchronized void countdown() throws InterruptedException {
        while (count > 0) {
            System.out.println(count);
            count--;
            notify();
            if (count > 0) wait();
        }
    }
}

public class question8 {
    public static void main(String[] args) throws InterruptedException {
        Countdown countdown = new Countdown();
        Thread t1 = new Thread(() -> { try { countdown.countdown(); } catch (InterruptedException e) { e.printStackTrace(); } });
        Thread t2 = new Thread(() -> { try { countdown.countdown(); } catch (InterruptedException e) { e.printStackTrace(); } });
        t1.start(); t2.start(); t1.join(); t2.join();
    }
}
