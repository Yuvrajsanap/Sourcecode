class question3 extends Thread {
    private String threadName;

    question3(String name) {
        threadName = name;
    }

    public void run() {
        String[] messages = {"One", "Two", "Three", "Four", "Five"};
        for (String message : messages) {
            System.out.println(threadName + " running: " + message);
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        question3 thread1 = new question3("Thread 1");
        question3 thread2 = new question3("Thread 2");

        thread1.start();
        try {
            thread1.join(); 
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        thread2.start();
    }
}
