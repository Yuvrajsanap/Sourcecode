//priority thread
class question1 extends Thread {
    public question1(String name) {
        super(name);
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Priority: " + Thread.currentThread().getPriority() + " - " + i);
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        question1 thread1 = new question1("Thread1");
        question1 thread2 = new question1("Thread2");
        question1 thread3 = new question1("Thread3");

        // Setting priorities
        thread1.setPriority(Thread.MIN_PRIORITY); // Priority 1
        thread2.setPriority(Thread.NORM_PRIORITY); // Priority 5
        thread3.setPriority(Thread.MAX_PRIORITY); // Priority 10

        thread1.start(); 
        thread2.start(); 
        thread3.start(); 
    }
}
