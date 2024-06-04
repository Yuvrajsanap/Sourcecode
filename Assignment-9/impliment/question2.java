class question2 implements Runnable {
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
        question2 runnable1 = new question2("Thread 1");
        question2 runnable2 = new question2("Thread 2");

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        thread1.start();
        thread2.start();
    }
}
