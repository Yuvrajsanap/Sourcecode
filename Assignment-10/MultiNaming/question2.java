class BankAccount {
    private int balance = 1000;

    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " withdrew " + amount + ". Balance: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " tried to withdraw " + amount + ". Insufficient balance.");
        }
    }
}

public class question2{
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        Thread thread1 = new Thread(() -> {
            account.withdraw(700);
        }, "Thread-1");

        Thread thread2 = new Thread(() -> {
            account.withdraw(500);
        }, "Thread-2");

        thread1.start();
        thread2.start();
    }
}
