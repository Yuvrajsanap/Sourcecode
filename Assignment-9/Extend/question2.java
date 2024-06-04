class question2 extends Thread {
    private String threadName;

    question2(String name) {
        threadName = name;
    }

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(threadName + " - Count: " + i);
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        question2 thread1 = new question2("Thread 1");
        question2 thread2 = new question2("Thread 2");

        thread1.start();
        thread2.start();
    }
}
