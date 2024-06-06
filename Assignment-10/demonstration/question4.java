class Calculator {
    private int result;
    private boolean isCalculated = false;

    public synchronized void calculate(int a, int b) throws InterruptedException {
        result = a + b; isCalculated = true;
        System.out.println("Calculated: " + result); notify();
    }

    public synchronized void getResult() throws InterruptedException {
        while (!isCalculated) wait();
        System.out.println("Result: " + result);
    }
}

public class question4 {
    public static void main(String[] args) throws InterruptedException {
        Calculator calculator = new Calculator();
        Thread calculatorThread = new Thread(() -> { try { calculator.calculate(5, 3); } catch (InterruptedException e) { e.printStackTrace(); } }, "Calculator-Thread");
        Thread resultThread = new Thread(() -> { try { calculator.getResult(); } catch (InterruptedException e) { e.printStackTrace(); } }, "Result-Thread");
        calculatorThread.start(); resultThread.start(); calculatorThread.join(); resultThread.join();
    }
}
