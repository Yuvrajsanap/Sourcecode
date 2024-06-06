class OddEvenPrinter {
    private boolean isOddTurn = true;

    public synchronized void printOdd(int number) throws InterruptedException {
        while (!isOddTurn) wait();
        System.out.println("Odd: " + number);
        isOddTurn = false;
        notify();
    }

    public synchronized void printEven(int number) throws InterruptedException {
        while (isOddTurn) wait();
        System.out.println("Even: " + number);
        isOddTurn = true;
        notify();
    }
}

public class questionn7 {
    public static void main(String[] args) throws InterruptedException {
        OddEvenPrinter printer = new OddEvenPrinter();
        Thread oddThread = new Thread(() -> { for (int i = 1; i <= 9; i += 2) try { printer.printOdd(i); } catch (InterruptedException e) { e.printStackTrace(); } });
        Thread evenThread = new Thread(() -> { for (int i = 2; i <= 10; i += 2) try { printer.printEven(i); } catch (InterruptedException e) { e.printStackTrace(); } });
        oddThread.start(); evenThread.start(); oddThread.join(); evenThread.join();
    }
}
