class BankAccount {
    public double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

public class qustion2 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        account.setBalance(-500); 
        double balance = account.getBalance(); 
        System.out.println("Updated balance: " + balance);
    }
}

