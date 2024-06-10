class question5 {
    private static int counter = 0;

    public void increment() {
        synchronized(question5.class) {
            counter++;
        }
    }

    public int getCounter() {
        synchronized(question5.class) {
            return counter;
        }
    }

    public static void main(String[] args) {
        question5 resource1 = new question5();
        question5 resource2 = new question5();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                resource1.increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                resource2.increment();
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Counter 1: " + resource1.getCounter());
        System.out.println("Counter 2: " + resource2.getCounter());
    }
}
