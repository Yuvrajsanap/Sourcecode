class Printer {
    public synchronized void printNumbers() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " prints: " + i);
        }
    }
}

public class question3 {
    public static void main(String[] args) {
        Printer printer = new Printer();

        Thread thread1 = new Thread(() -> {
            printer.printNumbers();
        }, "Printer-Thread-1");

        Thread thread2 = new Thread(() -> {
            printer.printNumbers();
        }, "Printer-Thread-2");

        thread1.start();
        thread2.start();
    }
}
