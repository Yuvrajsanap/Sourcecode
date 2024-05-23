import yuv.checkprime;

public class question5 {
    public static void main(String args[])
    {
        checkprime primeChecker = new checkprime();
        int number = 29;
        if (primeChecker.isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
