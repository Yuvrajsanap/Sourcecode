class question4 implements Runnable {
    private int limit;

    question4(int limit) {
        this.limit = limit;
    }

    public void run() {
        int a = 0, b = 1;
        System.out.print("Fibonacci sequence: ");
        for (int i = 0; i < limit; i++) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
    }

    public static void main(String[] args) {
        int limit = 10; 
        question4 fibonacci = new question4(limit);
        Thread thread = new Thread(fibonacci);
        thread.start();
    }
}
